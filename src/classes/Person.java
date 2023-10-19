package classes;

import aux.MyLib;

public abstract class Person{

    private String name;
    private int age;

    public int getAge() { return age; }

    public String getName() { return name; }

    public void setAge(int newAge){ 
        if(newAge < 0) return;
        this.age = newAge; 
    }

    public void setName(String newName){ 
        if(MyLib.invalidString(newName)) return;
        this.name = newName; 
    }

    public String getInfo(){
        return "\nNome: " + this.name +
            "\nIdade: " + this.age;
    }
}