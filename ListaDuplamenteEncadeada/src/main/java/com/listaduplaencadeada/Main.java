package com.listaduplaencadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> newList = new ListaDuplamenteEncadeada<>();

        newList.add("c1");
        newList.add("c2");
        newList.add("c3");
        newList.add("c4");
        newList.add("c5");
        newList.add("c6");
        newList.add("c7");
        newList.add(3,"c8");

        System.out.println("A lista encadeada dupla tem tamanho: " + newList.size());
        System.out.println(newList);
        newList.remove(5);
        System.out.println(newList);
        System.out.println(newList.get(3));
    }
}
