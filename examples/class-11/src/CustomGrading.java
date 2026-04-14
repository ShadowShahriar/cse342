class CustomExp extends Exception {
	CustomExp(String s) {
		super(s);
	}
}

class Grading {
	int marks;

	Grading(int m) {
		marks = m;
	}

	void check() throws CustomExp {
		if (marks < 0 || marks > 100) 
			throw new CustomExp("Marks out of bound");
		else
			System.out.println("Marks within the range");
	}
}

public class CustomGrading {
	public static void main(String[] args) {
		Grading g = new Grading(122);

		try{
			g.check();
		} catch (CustomExp e) {
			System.out.println(e.getMessage());
		}
	}
}
