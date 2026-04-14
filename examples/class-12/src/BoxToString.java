class Box {
	int w, h;

	Box(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public String toString()
	{
		return "dimensions are: " + w + " by " + h + ".";
	}
}

public class BoxToString {
	public static void main(String[] args) {
		Box b = new Box(10, 5);
		String s = "Box " + b;
		System.out.println(b);
		System.out.println(s);
	}
}
