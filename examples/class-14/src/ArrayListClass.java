import java.util.*;

class Student {
	int id;
	String name;

	Student() {

	}
	
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display(ArrayList<Student> c1) {
		for (Student s : c1) {
			System.out.println(s);
		}
	}

	public String toString() {
		return "id: " + id + " | name: " + name;
	}
}

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList<Student> c1 = new ArrayList<>();
		Student s1 = new Student(2011, "ABC");
		Student s2 = new Student(3011, "DEF");
		Student s3 = new Student();

		c1.add(s1);
		c1.add(s2);
		s3.display(c1);
	}
}
