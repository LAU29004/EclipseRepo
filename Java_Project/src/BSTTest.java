import com.BinaryTree.*;
public class BSTTest {

	public static void main(String [] args) {
		BinaryTree bt = new BinaryTree();
		bt.add(10);
		bt.add(5);
		bt.add(30);
		bt.add(24);
		System.out.println("InOrder Traversal is:");
		bt.InOrder();
	}

}
