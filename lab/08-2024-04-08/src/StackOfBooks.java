import java.util.*;

class Book{
    String title, author;
    int price;

    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return "\nTitle: " + title
                + " | Author: " + author
                + " | Price: Taka " + price;
    }
}

public class StackOfBooks {
    public static void main(String[] args) {
        Stack<Book> books = new Stack<>();
        books.push(new Book("Book A", "Auth A", 100));
        books.push(new Book("Book B", "Auth B", 330));
        books.push(new Book("Book C", "Auth C", 210));
        books.push(new Book("Book D", "Auth D", 350));
        books.push(new Book("Book E", "Auth E", 550));
        books.push(new Book("Book F", "Auth F", 800));
        System.out.println(books);

        books.pop();
        System.out.println(books.peek());
    }
}
