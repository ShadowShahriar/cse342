abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    void pay(){
        System.out.println("Pay by card.");
    }
}

class PayPalPayment extends Payment {
    void pay(){
        System.out.println("Pay via PayPal.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment ccp = new CreditCardPayment();
        ccp.pay();

        Payment ppp = new PayPalPayment();
        ppp.pay();
    }
}
