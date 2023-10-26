package classes;

import java.util.ArrayList;

import aux.MyLib;

public class Delegacia {
    private String nome;
    private String endereco;
    private String contato;

    ArrayList<Policial> policiais = new ArrayList<>();

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
        if(MyLib.invalidString(endereco)) return;
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        if(MyLib.invalidString(contato)) return;
        this.contato = contato;
    }

    public ArrayList<Policial> getPoliciais() {
        return policiais;
    }

    public void addPolicial(Policial policial){
        if(policial == null) return;
        policiais.add(policial);
    }
}
