package Library;
public class Member {
    private String name;
    private Book bk;

    public Member(String name) {
        this.name = name;
    }

    public String toString() {
        return "Member [Name=" + name + "]";
    }

    public void status() {
        if (bk == null) {
            System.out.println(name + " has no book!");
        } else {
            System.out.println(name + " has " + bk);
        }
    }

    // Issue a book to this member
    public void issueBook(Book b)throws LibraryException {
        if (bk != null) {
            throw new LibraryException(name + " already has a book: " + bk);
        }
        if (b.getMember() != null) {
            throw new LibraryException("Book is already issued by " + b.getMember());
        }
        bk = b;
        b.setMember(this);
        System.out.println(name + " issued " + b);
    }

    // Return the book
    public void returnBook() {
        if (bk != null) {
            System.out.println(name + " returned " + bk);
            bk.setMember(null);
            bk = null;
        } else {
            System.out.println(name + " has no book to return!");
        }
    }
}
