package Stack;
public class DSTest {

	    public static void main(String[] args) {
	        StackDemo stack = new StackDemo();

	        stack.push(100);
	        stack.push(200);

	        System.out.println("Top element is: " + stack.peek()); 
	        System.out.println("Popped element: " + stack.pop());  
	        System.out.println("Is stack empty? " + stack.isEmpty()); 
	    }
	}

