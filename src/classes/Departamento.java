package classes;

import aux.MyLib;

public class Departamento {

    private String nome;
    private String endereco;
    private String contato;

    public Departamento(String nome, String endereco, String contato){
        this.nome = nome;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(MyLib.invalidString(nome)) return;
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
