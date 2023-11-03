package entity;

import aux.MyLib;
import classes.Document;
import interf.DBCaseEntity;

public class Case extends Document implements DBCaseEntity {
    private int id;
    private String caseNumber;
    private String openingDate;
    private String status;
    private String departmentName;
    private String policeStationName;
    private String copName;
    private String witnessName;
    private String suspectName;

    public Case(int id, 
            String caseNumber, String openingDate, String status,
            String departmantName, String policeStationName, String copName,
            String witnessName, String suspectName){
        this.id = id;
        this.caseNumber = caseNumber;
        this.openingDate = openingDate;
        this.status = status;
        this.departmentName = departmantName;
        this.policeStationName = policeStationName;
        this.copName = copName;
        this.witnessName = witnessName;
        this.suspectName = suspectName;
    }

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

    public String getCopName() { return copName; }

    public String getDepartmentName() { return departmentName; }

    public String getPoliceStationName() { return policeStationName; }

    public String getSuspectName() { return suspectName; }

    public String getWitnessName() { return witnessName; }

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

    public void setCopName(String copName) {
        if(MyLib.invalidString(copName)) return;
        this.copName = copName;
    }

    public void setDepartmentName(String departmentName) {
        if(MyLib.invalidString(departmentName)) return;
        this.departmentName = departmentName;
    }

    public void setPoliceStationName(String policeStationName) {
        if(MyLib.invalidString(policeStationName)) return;
        this.policeStationName = policeStationName;
    }

    public void setSuspectName(String suspectName) {
        if(MyLib.invalidString(suspectName)) return;
        this.suspectName = suspectName;
    }

    public void setWitnessName(String witnessName) {
        if(MyLib.invalidString(witnessName)) return;
        this.witnessName = witnessName;
    }
}
