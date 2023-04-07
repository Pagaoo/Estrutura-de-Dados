package com.listacircular;

public class Node<T> {

    private T conteudo;
    private Node<T> nextNode;

    public Node(T conteudo) {
        this.nextNode = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo=" + conteudo +
                '}';
    }
}
