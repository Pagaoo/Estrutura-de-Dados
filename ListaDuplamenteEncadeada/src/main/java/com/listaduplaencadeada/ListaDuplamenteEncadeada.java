package com.listaduplaencadeada;

public class ListaDuplamenteEncadeada<T> {

    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.firstNode = null;
        this.lastNode = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private DoubleNode<T> getNode(int index) {
        DoubleNode<T> auxNode = firstNode;

        for (int i = 0; (i < index) && (auxNode != null) ; i++) {
            auxNode = auxNode.getNextNode();
        }
        return auxNode;
    }

    public T get(int index) {
        return this.getNode(index).getConteudo();
    }

    public void add(T conteudo) {
        DoubleNode<T> newNode = new DoubleNode<>(conteudo);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);

        if (firstNode == null) {
            firstNode = newNode;
        }
        if (lastNode != null) {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        DoubleNode<T> auxNode = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<T>(conteudo);
        newNode.setNextNode(auxNode);

        if (newNode.getNextNode() != null) {
            newNode.setPreviousNode(auxNode.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        } else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }

        if (index == 0) {
            firstNode = newNode;
        } else {
            newNode.getPreviousNode().setNextNode(newNode);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            firstNode = firstNode.getNextNode();
            if (firstNode != null) {
                firstNode.setPreviousNode(null);
            }
        } else {
            DoubleNode<T> auxNode = getNode(index);
            auxNode.getPreviousNode().setNextNode(auxNode.getNextNode());
            if (auxNode != null) {
                auxNode.getNextNode().setPreviousNode(auxNode.getPreviousNode());
            } else {
                lastNode = auxNode;
            }
        }
        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String str = "";

        DoubleNode<T> auxNode = firstNode;
        for (int i = 0; i < size(); i++) {
            str += "[Node{conteudo=" + auxNode.getConteudo() + "}] ---> ";
            auxNode = auxNode.getNextNode();
        }
        str += "null";
        return str;
    }
}
