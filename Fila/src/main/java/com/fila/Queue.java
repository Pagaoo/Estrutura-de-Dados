package com.fila;

public class Queue<T> {

    private Node<T> refEntryNode;

    public Queue() {
        this.refEntryNode = null;
    }

    public boolean isEmpty() {
        return refEntryNode == null ? true : false;
    }

    public void enqueue(T obj) {
        Node newNode = new Node(obj);
        newNode.setRefNode(refEntryNode);
        refEntryNode = newNode;
    }

    public T first() {
        if (!this.isEmpty()) {
            Node firstNode = refEntryNode;
            while (true) {
                if (firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                } else {
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            Node firstNode = refEntryNode;
            Node auxNode = refEntryNode;

            while (true) {
                if (firstNode.getRefNode() != null) {
                    auxNode = firstNode;
                    firstNode = firstNode.getRefNode();
                } else {
                    auxNode.setRefNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";
        Node auxNode = refEntryNode;

        if (refEntryNode != null) {
            while (true) {
                str += "[Node{object=" + auxNode.getObject() + "}] ----> ";
                if (auxNode.getRefNode() != null) {
                    auxNode = auxNode.getRefNode();
                } else {
                    str += "null";
                    break;
                }
            }
        } else {
            str = "null";
        }
        return str;
    }
}
