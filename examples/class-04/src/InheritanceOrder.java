class iA{
    iA(){
        System.out.println("A");
    }
}

class iB extends iA{
    iB(){
        System.out.println("B");
    }
}

public class InheritanceOrder {
    public static void main(String[] args) {
        iB ob = new iB();
    }
}
