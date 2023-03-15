package com.projetono;

public class Node<T> {
    private T conteudo;
    private Node<T> nextNode;

    //gerar construct somente para a str pq só terá get/set para o nextNode
    public Node(T conteudo) {
        this.nextNode = null; // garante que a ref pro proximo nó é null
        this.conteudo = conteudo;
    }

    public T getconteudo() {
        return conteudo;
    }

    public void setconteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    //Somente do str, pois é o que será colocado na tela com print
    @Override
    public String toString() {
        return "Node{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
