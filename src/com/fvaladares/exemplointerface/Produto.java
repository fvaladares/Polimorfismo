package com.fvaladares.exemplointerface;

public abstract class Produto implements ExemploInterface{
    double valorUnitario;

    public Produto(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


}
