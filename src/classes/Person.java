package classes;

public abstract class Person{
    private String name;
    private int age;

    public int getAge() { return age; }
    public String getName() { return name; }

    public String getInfo(){
        return "\nNome: " + this.name +
            "\nIdade: " + this.age;
    }
}