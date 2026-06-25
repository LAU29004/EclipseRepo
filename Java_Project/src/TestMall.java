import Mall.AddCartException;
import Mall.Product;
import Mall.ShoppingCart;

public class TestMall {
    public static void main(String[] args) {
        Product p1 = new Product("Milk", 60.00);
        Product p2 = new Product("Pen", 10.00);
        Product p3 = new Product("Butter", 80.00);
        Product p4 = new Product("WaterBottle", 200.00);
        Product p5 = new Product("Bag", 1000.00);
        Product p6 = new Product("Notebook", 50.00);

        ShoppingCart sh1 = new ShoppingCart();

        try {
            sh1.addToCart(p1);
            sh1.addToCart(p2);
            sh1.addToCart(p3);
            sh1.addToCart(p4);
            sh1.addToCart(p5);
            sh1.addToCart(p6); 
        } catch (AddCartException e) {
            System.out.println(e.getMessage());
        }

        sh1.checkout();
    }
}
