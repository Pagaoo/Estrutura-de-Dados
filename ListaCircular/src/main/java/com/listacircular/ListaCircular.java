package com.listacircular;

public class ListaCircular<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public int size() {
        return this.listSize;
    }

    public ListaCircular() {
        this.tail = null;
        this.head = null;
        this.listSize = 0;
    }

    public boolean isEmpty() {
        return this.listSize == 0 ? true : false;
    }

    private Node<T> getNode(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia");
        }
        if (index == 0) {
            return this.tail;
        }

        Node<T> auxNode = this.tail;
        for (int i = 0; (i < index) && (auxNode != null); i++) {
            auxNode =  auxNode.getNextNode();
        }
        return auxNode;
    }

    public T get(int index) {
        return this.getNode(index).getConteudo();
    }

    public void remove(int index) {
        if (index >= this.listSize) {
            throw new IndexOutOfBoundsException("O index é maior que o tamanho da lista");
        }

        Node<T> auxNode = this.tail;
        if (index == 0) {
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail);
        } else if (index == 1) {
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        } else {
            for (int i = 0; i < index - 1; i++) {
                auxNode = auxNode.getNextNode();
            }
            auxNode.setNextNode(auxNode.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public void add(T conteudo) {
        Node<T> newNode = new Node<>(conteudo);
        if (this.listSize == 0) {
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(tail);
        } else {
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    @Override
    public String toString() {
        String str = "";

        Node<T> auxNode = this.tail;
        for (int i = 0; i < this.size(); i++) {
            str += "[Node{conteudo" + auxNode + "}] ------> ";
            auxNode = auxNode.getNextNode();
        }

        str += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

        return str;
    }
}
