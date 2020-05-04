package com.fvaladares;

public class Main {

    public static void main(String[] args) {
        // Associação de uma referêcia a super classe com uma variável da superclasse
//        Super sup = new Super();
        // Associção de uma referência à sub classe com uma variável da subclasse
        Sub sub = new Sub();
        // Associação de uma referência da subclasse a uma veriável da superclasse
        Super poli = new Sub();

//        sup.print(); // super
        System.out.println("----\n");
        sub.print(); // sub
        System.out.println("----\n");
        poli.print(); // sub
        sub.print2();
        poli.print2();
    }
}
