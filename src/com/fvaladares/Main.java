package com.fvaladares;

public class Main {

    public static void main(String[] args) {
        // Associação de uma referêcia a super classe com uma variável da superclasse
//        Super sup = new Super();
        // Associção de uma referência à sub classe com uma variável da subclasse
        Sub sub = new Sub();
        // Associação de uma referência da subclasse a uma veriável da superclasse
        Super poli = new SubSub();


//        sub.print2();
//        System.out.println("-----");
//        poli.print2();

        MeuTeste meuTeste = new MeuTeste();

        meuTeste.print(poli);
        meuTeste.print(sub);

        System.out.println("\n\n");
        System.out.println(poli.getClass());

        if ( poli instanceof SubSub ){

            // Primeira forma de fazer Downcast
            SubSub temp = (SubSub) poli; // Downcast! Convertendo o supertipo no subtipo
            temp.test();
            // Segunda forma de fazer Downcast (útil quando precisamos fazer uma única chamada ;)
//            ((SubSub) poli).test();
        }

//        poli.test();

//        sup.print(); // super
//        System.out.println("----\n");
//        sub.print(); // sub
//        System.out.println("----\n");
//        poli.print(); // sub
//        sub.print2();
//        poli.print2();
    }
}


//        if(poli instanceof SubSub){
//                SubSub temp = (SubSub) poli;
//                ((SubSub) poli).test();
//                temp.test();
//                System.out.println("Passou!");
//                System.out.printf("Temp: %s\n", temp.getClass());
//                System.out.printf("Poli: %s\n", poli.getClass());
//                }