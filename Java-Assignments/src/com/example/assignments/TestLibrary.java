package com.example.assignments;
import Library.Book;
import Library.LibraryException;
import Library.Member;

public class TestLibrary {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Kite Runner");
        //Book b3 = new Book("Wings Of Fire");
        
        Member m1 = new Member("George");
        Member m2 = new Member("Martha");
        Member m3 = new Member("Laukik");
        
        b1.status();
        m1.status();

        // Issue book to member
        try {
			m1.issueBook(b1); 
        m1.issueBook(b2);
        m2.issueBook(b2);
        m3.issueBook(b1);
        // Print their status
        b1.status();
        m1.status();

        // Return book from member
        m2.returnBook();

        // Print status again
        b1.status();
        m1.status();
        }
        catch (LibraryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
