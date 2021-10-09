package com.bl.hashtable;

public class MyHashMap<K, V> {
    LinkedList<K> linkedList;

    public MyHashMap() {
        this.linkedList = new LinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.linkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.linkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    public String toString() {
        return "LinkedListNodes{" + linkedList + '}';
    }
}
