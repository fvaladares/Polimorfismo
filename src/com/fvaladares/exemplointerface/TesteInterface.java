package com.fvaladares.exemplointerface;

public class TesteInterface {
    public static void main(String[] args) {
        ExemploInterface granel = new Granel(10,2.5,.1);
        ExemploInterface unidade = new Unidade(20, 2);

        System.out.println(granel + "\nValor total : R$ " + granel.calcularPrecoFinal());
        System.out.println(unidade+ "\nValor total : R$ " + unidade.calcularPrecoFinal());



    }
}
