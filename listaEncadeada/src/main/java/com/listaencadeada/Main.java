package com.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> newList = new ListaEncadeada<>();

        newList.add("teste 1");
        newList.add("teste 2");
        newList.add("teste 3");
        newList.add("teste 4");


        System.out.println(newList.size());
        System.out.println(newList.get(0));
        System.out.println(newList.get(3));

        System.out.println(newList);

        newList.remove(2);
        System.out.println(newList);
    }
}
