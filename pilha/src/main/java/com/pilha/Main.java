package com.pilha;

public class Main {
    public static void main(String[] args) {

        Pilha newPilha = new Pilha();

        System.out.println(newPilha.isEmpty());

        newPilha.push(new Node(1));
        newPilha.push(new Node(2));
        newPilha.push(new Node(3));
        newPilha.push(new Node(4));
        newPilha.push(new Node(5));
        newPilha.push(new Node(6));

        System.out.println(newPilha);

        newPilha.pop();

        System.out.println(newPilha);
        System.out.println(newPilha.top());

        newPilha.push(new Node(999));
        System.out.println(newPilha);
        System.out.println(newPilha.top());

        System.out.println(newPilha.isEmpty());
    }
}
