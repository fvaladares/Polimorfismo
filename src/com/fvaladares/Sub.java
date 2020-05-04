package com.fvaladares;

public class Sub extends Super{
    @Override
    public void print() {
        System.out.println("Chamada da subclasse\n");
    }

    @Override
    public void print2() {
        System.out.println("Opa, fui forçado a implementar este método....\n");
    }


}
