import java.util.Scanner;

class Marks {
    int rollNo, marks;
    String name;

    void getStudentDetails(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class Physics extends Marks {
}

class Chemistry extends Marks {
}

class Mathematics extends Marks {
}

public class MarksClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Physics[] physics = new Physics[n];
        Chemistry[] chemistry = new Chemistry[n];
        Mathematics[] mathematics = new Mathematics[n];

        int classTotal = 0;
        for (int i = 0; i < n; i++) {
            physics[i] = new Physics();
            chemistry[i] = new Chemistry();
            mathematics[i] = new Mathematics();

            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Physics Marks: ");
            int p = sc.nextInt();

            System.out.print("Chemistry Marks: ");
            int c = sc.nextInt();

            System.out.print("Mathematics Marks: ");
            int m = sc.nextInt();

            physics[i].getStudentDetails(roll, name, p);
            chemistry[i].getStudentDetails(roll, name, c);
            mathematics[i].getStudentDetails(roll, name, m);

            int total = p + c + m;
            classTotal += total;

            System.out.println("Total Marks of " + name + " = " + total);
        }

		double classAverage = classTotal / n;
		System.out.println("");
        System.out.println("Average Marks of the Class = " + classAverage);
        sc.close();
    }
}
