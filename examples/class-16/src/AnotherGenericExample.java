class A<T>{
    T a;

    A(T a){
        this.a = a;
    }

    void show(){
        System.out.println(a);
    }
}

public class AnotherGenericExample {
    public static void main(String[] args) {
        A<String> strObj = new A<>("HB");
        strObj.show();
    }
}
