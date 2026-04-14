interface _Processor<T>{
    void process(T val);
}

class _StringProcessor<T> implements _Processor<T>{
    public void process(T val) {
        System.out.println("Processed: " + val);
    }
}

class _IntegerProcessor<T> implements _Processor<T>{
    public void process(T val) {
        System.out.println("Processed: " + val);
    }
}

public class GenericClassInterface {
    public static void main(String[] args) {
        _Processor<String> p = new _StringProcessor();
        p.process("Hello");

        _Processor<Integer> i = new _IntegerProcessor();
        i.process(404);
    }
}
