package com.bl.hashtable;

public class LinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public LinkedList() {
        this.head = head;
        this.tail = tail;
    }

    /**
     * @param
     */
    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }

    public void printMyNodes() {
        System.out.println("MyNode: " + head);
    }

    public void append(INode<K> MyNode) {
        if (this.head == null) {
            this.head = MyNode;
        }
        if (this.tail == null) {
            this.tail = MyNode;
        } else {
            this.tail.setNext(MyNode);
            this.tail = MyNode;
        }

    }

    public void insert(INode MyNode, INode newNode) {

        INode tempNode = MyNode.getNext();
        MyNode.setNext(newNode);
        newNode.setNext(tempNode);

    }

    public INode<K> pop() {
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;

    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode<K> search(K key) {
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
}
