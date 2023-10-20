package classes;

import java.util.ArrayList;

public class Delegacia {
    private String nome;
    private String endereco;
    private String contato;


    ArrayList<Policial> policiais = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
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

    public ArrayList<Policial> getPoliciais() {
        return policiais;
    }

    public void addPolicial(Policial policial){
        policiais.add(policial);
    }
}
