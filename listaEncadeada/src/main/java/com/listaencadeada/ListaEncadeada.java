package com.listaencadeada;

public class ListaEncadeada<T> {

    private Node<T> entryRef;

    public ListaEncadeada() {
        this.entryRef = null;
    }

    public boolean isEmpty() {
        return entryRef == null ? true : false;
    }

    public int size() {
        int sizeList = 0;
        Node<T> auxNode = entryRef;

        while (true) {
            if (auxNode != null) {
                sizeList++;
                if (auxNode.getNextNode() != null) {
                    auxNode = auxNode.getNextNode();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return sizeList;
    }


    private void validaIndice(int index) {
        if (index >= size()) {
            int lastIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " dessa lista. A lista tem " + lastIndice + " de tamanho");
        }
    }

    public void add(T obj) {
        Node<T> newNode = new Node<>(obj);

        if (this.isEmpty()) {
            entryRef = newNode;
            return;
        }

        Node<T> auxNode = entryRef;
        for (int i = 0; i < this.size() - 1; i++) {
            auxNode = auxNode.getNextNode();
        }

        auxNode.setNextNode(newNode);
    }

    private Node<T> getNode(int index) {

        validaIndice(index);
        Node<T> auxNode = entryRef;
        Node<T> nodeRetorno = null;

        for (int i = 0; i <= index; i++) {
            nodeRetorno = auxNode;
            auxNode = auxNode.getNextNode();
        }
        return nodeRetorno;
    }

    public T get(int index) {
        return getNode(index).getConteudo();
    }

    public T remove(int index) {
        Node<T> pivotNode = this.getNode(index);

        if (index == 0) {
            entryRef = pivotNode.getNextNode();
            return pivotNode.getConteudo();
        }

        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(pivotNode.getNextNode());
        return pivotNode.getConteudo();
    }

    @Override
    public String toString() {
        String str = "";
        Node<T> auxNode = entryRef;
        for (int i = 0; i < this.size(); i++) {
            str += "[Node{conteudo=" + auxNode.getConteudo() + "}] ------> ";
            auxNode = auxNode.getNextNode();
        }
        str += null;
        return str;
    }
}
