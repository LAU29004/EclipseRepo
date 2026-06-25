package Stack;
public class QueueTest {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo();

        System.out.println("--- Enqueuing Elements ---");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element (peek): " + queue.peek()); 

        System.out.println("\n--- Dequeuing Elements ---");
        System.out.println("Removed: " + queue.dequeue()); 
        System.out.println("Removed: " + queue.dequeue()); 

        System.out.println("\n--- Queue State ---");
        System.out.println("Front element now: " + queue.peek()); 
        System.out.println("Is queue empty? " + queue.isEmpty()); 
        
        System.out.println("Removed: " + queue.dequeue()); 
        System.out.println("Is queue empty now? " + queue.isEmpty()); 
    }
}
