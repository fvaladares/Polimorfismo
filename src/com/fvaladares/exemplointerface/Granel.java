package com.fvaladares.exemplointerface;

public class Granel extends Produto{
    double qtd;
    double desconto = .1;

    public Granel(double valorUnitario, double qtd, double desconto) {
        super(valorUnitario);
        this.qtd = qtd;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return (this.qtd * super.valorUnitario) * (1 - desconto);
    }

    @Override
    public String toString() {
        return "Granel{" +
                "qtd=" + qtd +
                ", desconto=" + desconto +
                ", valorUnitario=" + valorUnitario +
                '}';
    }
}
