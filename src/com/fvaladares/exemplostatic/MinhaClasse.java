package com.fvaladares.exemplostatic;

public class MinhaClasse {
    private String nome; // Atributo da instância
    private static String nomeCompartilhado; // Atributo da classe!

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCompartilhado() {
        return nomeCompartilhado;
    }

    public void setNomeCompartilhado(String nomeCompartilhado) {
        this.nomeCompartilhado = nomeCompartilhado;
    }

    @Override
    public String toString() {
        return "MinhaClasse{" +
                "nome='" + nome + '\'' +
                ", nomeCompartilhado='" + nomeCompartilhado + '\'' +
                '}';
    }
}
