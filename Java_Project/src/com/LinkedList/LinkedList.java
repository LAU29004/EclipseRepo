package com.LinkedList;

public class LinkedList<T> implements Iterable<T> {
    private class Node {
        private T data;
        public Node next;
        public Node(T data) { this.data = data; }
        public T getData() { return data; }
    }

    private Node head, last;
    private int size;

    public void remove(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        if (idx == 0) {
            head = head.next;
            if (head == null) {
                last = null;
            }
        } else {
            Node t = head;
            for (int c = 0; c < idx - 1; c++) {
                t = t.next;
            }
            Node toRemove = t.next;
            t.next = toRemove.next;
            if (toRemove == last) {
                last = t;
            }
        }
        size--;
    }

    public void insert(int idx, T data) {
        if (idx < 0) {
            throw new IndexOutOfBoundsException("Negative index not allowed");
        }
        Node n1 = new Node(data);
        if (idx == 0) {
            n1.next = head;
            head = n1;
            size++;
            if (last == null) {
                last = n1;
            }
            return;
        }
        Node t = head;
        int i = 0;
        while (t != null && i < idx - 1) {
            t = t.next;
            i++;
        }
        if (t == null) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        n1.next = t.next;
        t.next = n1;
        if (n1.next == null) {
            last = n1;
        }
        size++;
    }

    public void add(T data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        size++;
    }

    public void print() {
        Node t = head;
        while (t != null) {
            System.out.println(t.getData());
            t = t.next;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node current = head;
            public boolean hasNext() { return current != null; }
            public T next() {
                T data = current.getData();
                current = current.next;
                return data;
            }
        };
    }
}
