package classes;

import java.util.ArrayList;
import java.util.List;

import aux.MyLib;
import database.Database;
import entity.Case;
import exception.DatabasePersistenceException;

public class Cadastro {

    public void cadastraDepartamento(){}

    public void cadastraDelegacia(){}

    public void cadastraPolicial(){}

    //public void cadastraCaso(){}

    public void cadastraDestemunha(){}

    public void cadastraSuspeito(){}

    public void salvaCaso(int id, 
            String caseNumber, String openingDate, String status){
        try {
            if(id < 0 || invalidStrings(caseNumber, openingDate, status)){
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
