package com.example.assignments;
import com.LinkedList.*;

public class TestDataStructures {
	public static void main(String[] args) {
	    LinkedList<Integer> list = new LinkedList<>();
	    list.add(30);
	    list.add(20);
	    list.add(10);
	    list.insert(0, 35);
	    list.insert(2, 20);
	    list.print();

	    System.out.println("Removing index 2...");
	    list.remove(2);
	    list.print();
	    System.out.println("Size: " + list.size());
	}

}