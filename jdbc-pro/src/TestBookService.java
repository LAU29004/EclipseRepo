import java.util.Scanner;
import com.mmcoe.dao.BookDao;
import com.mmcoe.pojo.Book;
import com.mmcoe.service.BookNotFoundException;
import com.mmcoe.service.BookService;
import com.mmcoe.service.BookServiceImpl;
import java.util.List;

public class TestBookService {

    public static void main(String[] args) {
        BookDao dao = new BookDaoJdbcImpl();
        BookService service = new BookServiceImpl(dao);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- BOOK MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Book");
            System.out.println("2. Find Book by ISBN");
            System.out.println("3. List All Books");
            System.out.println("4. Find Books by Price Range");
            System.out.println("5. Delete Book");
            System.out.println("6. List Books Ordered by Title");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    service.save(new Book(isbn, title, author, price));
                    System.out.println("Book saved successfully.");
                    break;

                case 2:
                    System.out.print("Enter ISBN to find: ");
                    int findIsbn = scanner.nextInt();
                    try {
                        Book b = service.find(findIsbn);
                        System.out.println("Found: " + b);
                    } catch (BookNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    List<Book> allBooks = service.list();
                    if (allBooks.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        allBooks.forEach(System.out::println);
                    }
                    break;

                case 4:
                    System.out.print("Enter Minimum Price: ");
                    double min = scanner.nextDouble();
                    System.out.print("Enter Maximum Price: ");
                    double max = scanner.nextDouble();
                    List<Book> filteredBooks = service.findByPrice(min, max);
                    if (filteredBooks.isEmpty()) {
                        System.out.println("No books found in this price range.");
                    } else {
                        filteredBooks.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.print("Enter ISBN to delete: ");
                    int deleteIsbn = scanner.nextInt();
                    try {
                        service.delete(deleteIsbn);
                        System.out.println("Book deleted successfully.");
                    } catch (BookNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    List<Book> orderedBooks = service.listOrderByTitle();
                    if (orderedBooks.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        orderedBooks.forEach(System.out::println);
                    }
                    break;

                case 7:
                    System.out.println("Exiting system.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
