package Stack;

public class QueueDemo {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; 
    private Node rear;  

    public QueueDemo() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);

        if (this.rear == null) {
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! The queue is empty.");
            return -1;
        }

        int dequeuedValue = this.front.data;
        this.front = this.front.next; 

        if (this.front == null) {
            this.rear = null;
        }

        return dequeuedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return this.front.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

}
