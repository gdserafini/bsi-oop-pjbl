package classes;

import aux.MyLib;

public class Policial extends Person {
    private String cargo;
    private float salario;
    private String dataDeContratacao;
    private String nomeDelegacia;

    public Policial(String name, int age, String cargo,
            float salario, String dataDeContratacao, String nomeDelegacia){
        super(name, age);
        this.cargo = cargo;
        this.salario = salario;
        this.dataDeContratacao = dataDeContratacao;
        this.nomeDelegacia = nomeDelegacia;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nCargo: " + this.cargo +
                "\nSalario: " + this.salario +
                "\nContratado em: " + this.dataDeContratacao +
                "\nDelegacia onde atua: " + this.nomeDelegacia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if(MyLib.invalidString(cargo)) return;
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario <= 0) return;
        this.salario = salario;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        if(MyLib.invalidString(dataDeContratacao)) return;
        this.dataDeContratacao = dataDeContratacao;
    }

    public String getNomeDelegacia() {
        return nomeDelegacia;
    }

    public void setNomeDelegacia(String nomeDelegacia) {
        if(MyLib.invalidString(nomeDelegacia)) return;
        this.nomeDelegacia = nomeDelegacia;
    }
}
