class Student{
    private int id;
    private String name;
    private double cgpa;

    void set(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    void show(){
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + cgpa);
    }
}

public class StudentClass {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.set(408,"Shayan", 3.72);
        s1.show();
    }
}
