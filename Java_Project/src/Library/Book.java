package Library;

public class Book {
    private String title;
    private Member mbr;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [Title=" + title + "]";
    }

    public void status() {
        if (mbr == null) {
            System.out.println(title + " not issued to anyone!");
        } else {
            System.out.println(title + " issued to " + mbr);
        }
    }

    // Getter and Setter for Member
    public Member getMember() {
        return mbr;
    }

    public void setMember(Member m) {
        this.mbr = m;
    }
}
