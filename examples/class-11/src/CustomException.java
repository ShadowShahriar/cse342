class Exp extends Exception {
	Exp(String s) {
		super(s);
	}
}

class Demo {
	int age;

	Demo(int age) {
		this.age = age;
	}

	void check() throws Exp {
		if(age < 18)
			throw new Exp("Not eligible");
		else
			System.out.println("Eligible");
	}
}

public class CustomException {
	public static void main(String[] args) {
		Demo ob = new Demo(12);
		try{
			ob.check();
		} catch (Exp e) {
			System.out.println(e.getMessage());
		}
	}
}
