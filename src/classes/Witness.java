package classes;

import aux.MyLib;

public class Witness extends Person{
    private String address;
    private String contact;
    private String report;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(MyLib.invalidString(address)) return;
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if(MyLib.invalidString(contact)) return;
        this.contact = contact;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        if(MyLib.invalidString(report)) return;
        this.report = report;
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nEndereço: " + this.address +
                "\nContato: " + this.contact +
                "\nRelato: " + this.report;
    }
}
