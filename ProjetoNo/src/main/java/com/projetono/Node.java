package com.projetono;

public class Node {
    private String str;
    private Node nextNode;

    //gerar construct somente para a str pq só terá get/set para o nextNode
    public Node(String str) {
        this.nextNode = null; // garante que a ref pro proximo nó é null
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    //Somente do str, pois é o que será colocado na tela com print
    @Override
    public String toString() {
        return "Node{" +
                "str='" + str + '\'' +
                '}';
    }
}
