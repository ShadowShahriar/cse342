interface Processor<T>{
    void process(T val);
}

class StringProcessor implements Processor<String>{
    public void process(String val) {
        System.out.println("Processed: " + val);
    }
}

class IntegerProcessor implements Processor<Integer>{
    public void process(Integer val) {
        System.out.println("Processed: " + val);
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        Processor<String> p = new StringProcessor();
        p.process("Hello");

        Processor<Integer> i = new IntegerProcessor();
        i.process(404);
    }
}
