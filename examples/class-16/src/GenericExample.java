class Test<T>{
    T obj;
    Test(T obj){
        this.obj = obj;
    }

    T getObj(){
        return obj;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Test<Integer> intObj = new Test<>(100);
        System.out.println(intObj.getObj());

        Test<String> strObj = new Test<>("Hello");
        System.out.println(strObj.getObj());
    }
}
