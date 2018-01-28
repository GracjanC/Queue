package com.gracjan;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    private boolean isEmpty() {
        return head == null;
    }

    public void enqueue (T data) {
        Node<T> newNode = new Node<>(data);

        if (this.tail != null) {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;

        if (isEmpty())
            this.head = newNode;
    }

    public Node<T> peek() {
        return this.head;
    }

    public Node<T> dequeue() {
        Node<T> node = this.head;
        this.head = node.getNext();

        if (isEmpty())
            this.tail = null;

        return node;
    }

}
