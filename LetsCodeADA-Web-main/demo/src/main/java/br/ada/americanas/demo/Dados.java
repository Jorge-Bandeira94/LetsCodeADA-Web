package br.ada.americanas.demo;

public class Dados {
    public String name;
    public String cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome do cliente: " + this.name + "\n Número do cpf: " + this.cpf;
    }
}
