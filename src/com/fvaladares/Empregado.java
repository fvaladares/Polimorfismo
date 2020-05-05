package com.fvaladares;

public abstract class Empregado {
    String nome;
    String sobrenome;
    String documento;

    public void setEmpregado(String nome, String sobrenome, String documento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }
}
