package com.projetono;

public class Main {

    public static void main(String[] args) {

        Node node1 = new Node("Conteudo Node 1");
        Node node2 = new Node("Conteudo Node 2");

        node1.setNextNode(node2);

        Node node3 = new Node("Conteudo node 3");

        node2.setNextNode(node3);

        Node node4 = new Node("Conteudo node 4");

        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node2);

        System.out.println("-----------------------------------------");

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());
    }
}
