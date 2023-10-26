package classes;

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
            if(id < 0 || MyLib.invalidString(caseNumber) || 
                    MyLib.invalidString(status) || 
                    MyLib.invalidString(status)){
                throw new DatabasePersistenceException("Dados inválidos.");
            }
            if(Database.getCaseFile(id) == null){
                Database.persistData(
                    new Case(id, caseNumber, openingDate, status));
                return;
            }
            throw new DatabasePersistenceException(
                "Este caso id: " + id + " já está salvo no banco de dados.");
        } catch (DatabasePersistenceException e) {
            e.printStackTrace();
        }
    }

}
