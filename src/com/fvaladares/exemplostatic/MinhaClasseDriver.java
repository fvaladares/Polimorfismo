package com.fvaladares.exemplostatic;

import java.util.Scanner;

public class MinhaClasseDriver {
    public static void main(String[] args) {
        MinhaClasse mc1 = new MinhaClasse();
        MinhaClasse mc2 = new MinhaClasse();
        Scanner in = new Scanner(System.in);

        String temp;
        System.out.println("Informe o primeiro nome: ");
        temp = in.nextLine();
        mc1.setNome(temp);
        mc1.setNomeCompartilhado(temp);

        System.out.println("Informe o segundo nome: ");
        temp = in.nextLine();
        mc2.setNome(temp);
        mc2.setNomeCompartilhado(temp);

        System.out.println("MC1:\n" + mc1);
        System.out.println("MC2:\n" + mc2);

    }

}
