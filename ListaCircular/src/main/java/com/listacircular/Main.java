package com.listacircular;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> newList = new ListaCircular<>();

        System.out.println(newList.isEmpty());

        newList.add("0");
        newList.add("1");
        newList.add("2");
        newList.add("3");
        newList.add("4");
        System.out.println(newList);
        System.out.println(newList.isEmpty());
        System.out.println(newList.size());


        newList.remove(2);
        System.out.println(newList);
    }
}
