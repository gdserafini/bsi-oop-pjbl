package main;

import aux.MyLib;
import classes.Delegacia;
import classes.Department;
import classes.Policial;
import classes.Suspect;
import classes.Witness;
import database.Database;
import entity.Case;
import exception.DatabasePersistenceException;

import javax.swing.*;
import java.util.regex.Pattern;

public class Cadastro {

    public Department cadastraDepartamento(String nome, String endereco, String contato) {
        if (MyLib.invalidString(nome) || MyLib.invalidString(endereco) || MyLib.invalidString(contato)) {
            return null;
        } else {
            return new Department(nome, endereco, contato);
        }
    }
    public Delegacia cadastraDelegacia(String nome, String endereco, String contato) {
        if (MyLib.invalidString(nome) || MyLib.invalidString(endereco) || MyLib.invalidString(contato)) {
            return null;
        } else {
            return new Delegacia(nome, endereco, contato);
        }
    }

    public Policial cadastraPolicial(String nome, int idade, String cargo, float salario,
                                     String dateDeContratacao) {
        if (MyLib.invalidString(cargo) || MyLib.invalidString(dateDeContratacao) || salario <= 0) {
            return null;
        } else {
            return new Policial(nome, idade, cargo, salario, dateDeContratacao);
        }
    }

    public Witness cadastraTestemunha(String nome, int idade, String address, String contato, String report) {
        if (MyLib.invalidString(report) || MyLib.invalidString(nome) ||
                MyLib.invalidString(address) || MyLib.invalidString(contato) || idade <= 0) {
            return null;
        } else {
            return new Witness(nome, idade, address, contato, report);
        }
    }

    public Suspect cadastraSuspeito(String nome, int idade, String description, String endereco) {
        if (MyLib.invalidString(nome) || MyLib.invalidString(endereco) ||
                MyLib.invalidString(description) || idade <= 0) {
            return null;
        } else {
            return new Suspect(nome, idade, description, endereco);
        }
    }

    public void saveCaseWithClasses(int id, String caseNumber, String openingDate, String status,
                                    Department department, Delegacia delegacia, Policial policial,
                                    Witness witness, Suspect suspect) {
        try { if (id < 0 || invalidStrings(caseNumber, openingDate, status,
                    department.getNome(), delegacia.getNome(), policial.getName(),
                    witness.getName(), suspect.getName()) ||
                    invalidCaseNumber(caseNumber) || invalidDate(openingDate) ||
                    invalidStatus(status)) {
                throw new DatabasePersistenceException("Dados inválidos.");
            } else {
                Database.persistData(new Case(
                        id, caseNumber, openingDate,
                        status, department.getNome(), delegacia.getNome(),
                        policial.getName(), witness.getName(), suspect.getName()));
            }
        } catch (DatabasePersistenceException e) {
            e.printStackTrace();
        }
    }

    private static boolean invalidCaseNumber(String caseNumber){
        return (caseNumber.matches(".[a-zA-Z].") ||
                Integer.parseInt(caseNumber) < 0);
    }

    private static boolean invalidDate(String date){
        return !date.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    private static boolean invalidStatus(String status){
        return status.matches(".\\d.");
    }
    private boolean invalidStrings(String... strings) {
        for (String s : strings) {
            if (MyLib.invalidString(s)) {
                return true;
            }
        }
        return false;
    }

    public static void salvaCaso(int id, String caseNumber, String openingDate, String status){
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
    private static boolean invalidStrings(
            String caseNumber, String openingDate, String status){
        return MyLib.invalidString(caseNumber) || MyLib.invalidString(openingDate) ||
                MyLib.invalidString(status);
    }

}