abstract class Marks {
    int[] marks_val = {0,0,0,0};
    int count = 0;
    Marks(){}

    abstract void getPercentage();
}

class A extends Marks {
    A(int a, int b, int c){
        marks_val = new int[]{a, b, c, 0};
        count = 3;
    }
    void getPercentage(){
        double marks_sum = 0;
        for(int i = 0; i < count; i++){
            marks_sum += (double)marks_val[i];
        }
        System.out.println("Percentage of A: " + (marks_sum / count) + "%");
    }
}

class B extends Marks {
    B(int a, int b, int c, int d){
        marks_val = new int[]{a, b, c, d};
        count = 4;
    }
    void getPercentage(){
        double marks_sum = 0;
        for(int i = 0; i < count; i++){
            marks_sum += (double)marks_val[i];
        }
        System.out.println("Percentage of A: " + (marks_sum / count) + "%");
    }
}

public class MarksClass {
    public static void main(String[] args) {
        Marks stdA = new A(65, 88, 90);
        stdA.getPercentage();

        Marks stdB = new B(98,77,89,75);
        stdB.getPercentage();
    }
}
