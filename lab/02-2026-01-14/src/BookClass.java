class Book{
    private String title, author;
    private int yearPublished;

    Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    void displayInfo(){
        System.out.println("Book Information:"
                + "\nTitle: " + title
                + "\nAuthor: " + author
                + "\nYear Published: " + yearPublished
        );
    }
}

public class BookClass{
    public static void main(String[] args) {
        Book B1 = new Book("Atomic Habits", "James Clear", 2010);
        Book B2 = new Book("IKIGAI", "Sam Tsui", 2018);
        B1.displayInfo();
        B2.displayInfo();
    }
}
