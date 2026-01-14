class Student{
    private int studentID;
    private String name;
    private double CGPA;

    Student(int studentID, String name, double CGPA){
        this.studentID = studentID;
        this.name = name;
        this.CGPA = CGPA;
    }

    void display(){
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA + "\n");
    }

    boolean getID(int num){
        return this.studentID == num;
    }
}

class Registerar{
    int registered = 0;
    Student students[] = new Student[100];

    void registerNewStudent(int studentID, String name, double CGPA){
        if(registered >= 100) {
            System.out.println("Cannot register new student: No available seats");
        }else{
            students[registered] = new Student(studentID, name, CGPA);
            registered++;
        }
    }

    void displayAll(){
        for(int i = 0; i < registered; i++){
            students[i].display();
        }
    }

    void searchStudent(int studentID){
        for(int i = 0; i < registered; i++){
            if(students[i].getID(studentID)){
                System.out.println("Student Found.");
                students[i].display();
                return;
            }
        }
        System.out.println("Student NOT Found.");
    }

    void removeStudent(int studentID){
        Student[] students_temp = new Student[100];
        int j = 0;
        boolean wasRemoved = false;
        for(int i = 0; i < registered; i++){
            if(students[i].getID(studentID)){
                wasRemoved = true;
            }else{
                students_temp[j] = students[i];
                j++;
            }
        }
        students = students_temp;
        if(wasRemoved){
            System.out.println("Student with ID " + studentID + " was removed.");
            registered--;
        }else{
            System.out.println("Student with ID " + studentID + " NOT found.");
        }
    }
}

public class RegistrationSystem {
    public static void main(String[] args) {
        Registerar R = new Registerar();
        R.registerNewStudent(1, "A", 4.00);
        R.registerNewStudent(2, "B", 3.90);
        // R.registerNewStudent(3, "C", 3.93);
        // R.registerNewStudent(4, "D", 3.72);
        // R.registerNewStudent(5, "E", 3.11);
        // R.registerNewStudent(6, "F", 1.44);
        R.displayAll();

        // R.searchStudent(3);
        // R.searchStudent(44);
        R.removeStudent(5);
        R.displayAll();
    }
}
