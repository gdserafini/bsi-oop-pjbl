package classes;

public class Policial extends Person {
    private String cargo;
    private float salario;
    private String dataDeContratacao;
    private String nomeDelegacia;

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
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(String dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public String getNomeDelegacia() {
        return nomeDelegacia;
    }

    public void setNomeDelegacia(String nomeDelegacia) {
        this.nomeDelegacia = nomeDelegacia;
    }
}
