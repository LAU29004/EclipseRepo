package Mall;
import com.cart.*;
import com.LinkedList.*;
//import bank.BalanceException;

public class ShoppingCart implements Shopping {
	private LinkedList<Product> items;
	private final int limit = 5;
	private double total;
	public ShoppingCart() {
		items = new LinkedList<>();
		total = 0.0;
	}
	public void addToCart(Product p) throws AddCartException {
		if(p==null) {
			throw new AddCartException("Cannot add Null Product");
		}
		if(items.size()>=limit) {
			throw new AddCartException("The cart is full!");
		}
		items.add(p);
		total+=p.getPrice();
		
		
	}
	public void checkout() {
	    System.out.println("\nBill:");
	    int i = 1;
	    for (Product p : items) {
	        System.out.println(i + ". Item Name: " + p.getName() +
	                           "\nItem Price: " + p.getPrice() + "\n");
	        i++;
	    }
	    System.out.println("Total Bill is: " + total);
	}

}
