import java.util.*;

class Library {
	int b_id, b_price;
	String b_title, b_author;

	Library() { }

	Library(int b_id, int b_price, String b_title, String b_author) {
		this.b_id = b_id;
		this.b_price = b_price;
		this.b_title = b_title;
		this.b_author = b_author;
	}

	void display(Stack<Library> stk) {
		for (Library s : stk) {
			System.out.println(s);
		}
	}

	public String toString() {
		return "id: " + b_id + ", title: " + b_title + ", author: " + b_author + ", price: " + b_price;
	}

	void borrow(Stack<Library> stk) {
		stk.pop();
	}
}

public class StackLibrary {
	public static void main(String[] args) {
		Stack<Library> s1 = new Stack<>();
		Library l1 = new Library(1, 200, "AB", "CD");

		s1.add(l1);
		l1.display(s1);
		s1.pop();
		System.out.println(s1);
	}
}
