package entity;

import aux.MyLib;
import classes.Document;
import interf.DBCaseEntity;

public class Case extends Document implements DBCaseEntity {
    private int id;
    private String caseNumber;
    private String openingDate;
    private String status;

    public Case(int id, 
            String caseNumber, String openingDate, String status){
        this.id = id;
        this.caseNumber = caseNumber;
        this.openingDate = openingDate;
        this.status = status;
    }

    @Override
    public String getInfo(){
        return "\nNúmero do caso: " + this.caseNumber +
            "\nData de abertura: " + this.openingDate.toString() +
            "\nStatus: " + this.status;
    }

    @Override
    public int getCaseId() { return this.id; }

    @Override
    public String getDBCaseEntityData() 
            throws IllegalArgumentException, IllegalAccessException {
        return MyLib.formatComaStr(this);
    }

    public String getCaseNumber() { return caseNumber; }

    public int getId() { return id; }

    public String getOpeningDate() { return openingDate; }

    public String getStatus() { return status; }

    public void setCaseNumber(String caseNumber) {
        if(MyLib.invalidString(caseNumber)) return;
        this.caseNumber = caseNumber;
    }

    public void setId(int id) { 
        if(id < 0) return;
        this.id = id;
    }

    public void setOpeningDate(String openingDate) {
        if(MyLib.invalidString(openingDate)) return;
        this.openingDate = openingDate;
    }

    public void setStatus(String status) {
        if(MyLib.invalidString(status)) return;
        this.status = status;
    }
}
