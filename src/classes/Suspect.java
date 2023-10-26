package classes;

import aux.MyLib;

public class Suspect extends Person{
    private String descrption;
    private String address;

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        if(MyLib.invalidString(descrption)) return;
        this.descrption = descrption;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(MyLib.invalidString(address)) return;
        this.address = address;
    }
    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nDescrição: " + this.descrption +
                "\nEndereço: " + this.address;
    }
}


