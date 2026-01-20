class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println("id: " + id + "\nname: " + name);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        for(int i = 0; i < s.length; i++){
            s[i] = new Student(123, "Rahim");
        }

        for(Student x: s){
            x.show();
        }

        System.out.print("\n");

        Student s2[] = {
                new Student(21, "ABC"),
                new Student(123, "Rahim"),
                new Student(456, "Karim")
        };

        for(Student x: s2){
            x.show();
        }
    }
}
