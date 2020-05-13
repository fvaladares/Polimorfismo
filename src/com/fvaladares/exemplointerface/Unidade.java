package com.fvaladares.exemplointerface;

public class Unidade extends Produto{
    int qtd;

    public Unidade(double valorUnitario, int qtd) {
        super(valorUnitario);
        this.qtd = qtd;
    }

    @Override
    public double calcularPrecoFinal() {
        return qtd *  valorUnitario;
    }

    @Override
    public String toString() {
        return "Unidade{" +
                "qtd=" + qtd +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
