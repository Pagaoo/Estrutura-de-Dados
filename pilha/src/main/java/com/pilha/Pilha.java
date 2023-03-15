package com.pilha;

public class Pilha {

    private Node refNodeEntry;

    public Pilha() {
        this.refNodeEntry = null;
    }

    public boolean isEmpty() {
        if (refNodeEntry == null) {
            return true;
        }
        return false;
    }

    public Node top() {
        return refNodeEntry;
    }

    public void push(Node newNode) {
        Node auxNode = refNodeEntry;
        refNodeEntry = newNode;
        newNode.setRefNode(auxNode);
    }

    public Node pop() {
        if (!this.isEmpty()) {
            Node nodePopped = refNodeEntry;
            refNodeEntry = refNodeEntry.getRefNode();
            return nodePopped;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "------------------------\n";
        str += "            Pilha\n";
        str += "------------------------\n";

        Node auxNode = refNodeEntry;

        while (true) {
            if (auxNode != null) {
                str += "[Node{dado=" + auxNode.getDado() + "}]\n";
                auxNode = auxNode.getRefNode();
            } else {
                break;
            }
        }
        str += "------------------------\n";
        return str;
    }
}
