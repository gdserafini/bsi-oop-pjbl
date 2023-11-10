package main;

import java.util.regex.Pattern;

import aux.MyLib;
import classes.Delegacia;
import classes.Department;
import classes.Policial;
import classes.Suspect;
import classes.Witness;
import database.Database;
import entity.Case;
import exception.DatabasePersistenceException;

public class Cadastro {

    public Department cadastraDepartamento(
            String nome, String endereco, String contato){ 
        if(MyLib.invalidString(nome) || MyLib.invalidString(contato) ||
            MyLib.invalidString(contato)) return null;
        else return new Department(nome, endereco, contato);
    }

    public Delegacia cadastraDelegacia(
            String nome, String endereco, String contato){ 
        if(MyLib.invalidString(nome) || MyLib.invalidString(contato) ||
            MyLib.invalidString(contato)) return null;
        else return new Delegacia(nome, endereco, contato);
    }

    public Policial cadastraPolicial(String nome, int idade,
            String cargo, float salario, String dateDeContratacao,
            String nomeDelegacia){ 
        if(MyLib.invalidString(cargo) || MyLib.invalidString(dateDeContratacao) ||
            MyLib.invalidString(nomeDelegacia) || salario <= 0) return null;
        else return new Policial(nome, idade, cargo, 
            salario, dateDeContratacao, nomeDelegacia);
    }

    //public void cadastraCaso(){}

    public Witness cadastraDestemunha(
            String nome, int idade, String address,
            String contato, String report){ 
        if(MyLib.invalidString(report) || MyLib.invalidString(nome) ||
            MyLib.invalidString(address) || MyLib.invalidString(contato) ||
            idade <= 0) return null;
        else return new Witness(nome, idade, address, contato, report);
    }

    public Suspect cadastraSuspeito(
            String nome, int idade, String description, String endereco){ 
        if(MyLib.invalidString(nome) || MyLib.invalidString(endereco) ||
            MyLib.invalidString(description) || idade <= 0) return null;
        else return new Suspect(nome, idade, description, endereco);
    }

    public void saveCaseWithClasses(int id, 
            String caseNumber, String openingDate, String status,
            Department department, Delegacia delegacia, Policial policial,
            Witness witness, Suspect suspect){
        try {
            if(id < 0 || invalidStrings(caseNumber, openingDate, status)){
                throw new DatabasePersistenceException("Dados inválidos.");
            }
            else Database.persistData(new Case(
                id, caseNumber, openingDate, 
                status, department.getNome(), delegacia.getNome(), 
                policial.getName(), witness.getName(), suspect.getName()));
        } catch (DatabasePersistenceException e) {
            e.printStackTrace();
        }
    }

    private boolean invalidCaseNumber(String caseNumber){
        return Pattern.compile(".*[a-aA-Z].*").matcher(caseNumber).matches();
    }

    private boolean invalidDate(String date){
        return Pattern.compile("\\d{2}/\\d{2}/\\d{4}").matcher(date).matches();
    }

    private boolean invalidStatus(String date){
        return Pattern.compile(".*\\d.*").matcher(date).matches();
    }

    public void salvaCaso(int id, 
            String caseNumber, String openingDate, String status){
        try {
            if(id < 0 || invalidStrings(caseNumber, openingDate, status) ||
                    invalidCaseNumber(caseNumber) || invalidDate(openingDate) ||
                    invalidStatus(status)){
                throw new DatabasePersistenceException("Dados inválidos.");
            }
            else Database.persistData(new Case(id, caseNumber, openingDate, status));
        } catch (DatabasePersistenceException e) {
            e.printStackTrace();
        }
    }

    private boolean invalidStrings(
            String caseNumber, String openingDate, String status){
        return MyLib.invalidString(caseNumber) || MyLib.invalidString(status) || 
            MyLib.invalidString(status);
    }

}
