class Grade<T>{
    T grade;

    public Grade(T grade){
        this.grade = grade;
    }

    void show(){
        System.out.println("Grade: " + grade);
    }
}

public class TaskGrading {
    public static void main(String[] args) {
        Grade<Integer> g1 = new Grade<>(4);
        Grade<Double> g2 = new Grade<>(3.98);
        Grade<String> g3 = new Grade<>("A+");

        g1.show();
        g2.show();
        g3.show();
    }
}
