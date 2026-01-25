import java.util.Scanner;

class Complex {
    int real, imag;

    Complex() {
        real = 3;
        imag = 4;
    }

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    void Read() {
        Scanner sc = new Scanner(System.in);
        int R, I;
        System.out.println("Enter real and imaginary numbers respectively: ");
        R = sc.nextInt();
        I = sc.nextInt();

        this.real = R;
        this.imag = I;
    }

    Complex Add(Complex ob){
        Complex temp = new Complex(this.real + ob.real, this.imag + ob.imag);
        return temp;
    }

    void Display() {
        System.out.println("Sum = " + real + " + " + imag + "i");
    }
}

public class ComplexClass {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.Read();

        Complex num2 = new Complex();
        num2.Read();

        Complex num3 = num1.Add(num2);
        num3.Display();
    }
}
