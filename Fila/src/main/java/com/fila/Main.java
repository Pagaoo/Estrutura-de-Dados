package com.fila;

public class Main {
    public static void main(String[] args) {
        Queue<String> newQueue = new Queue<>();

        newQueue.enqueue("1");
        newQueue.enqueue("2");
        newQueue.enqueue("3");
        newQueue.enqueue("4");
        newQueue.enqueue("5");

        System.out.println("Fila: " + newQueue);
        System.out.println("Retirando o: " + newQueue.dequeue());
        System.out.println("Fila: " + newQueue);

        newQueue.enqueue("12");
        System.out.println("Fila: " + newQueue);
        System.out.println("O primeiro da fila é: " + newQueue.first());

        System.out.println("Retirando o: " + newQueue.dequeue());
        System.out.println("Fila: " + newQueue);
        System.out.println("O primeiro da fila é: " + newQueue.first());

    }
}
