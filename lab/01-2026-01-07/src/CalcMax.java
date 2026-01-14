import java.util.*;
public class CalcMax {
    public static void max1(double[] array){
        double max = -1000000;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }

    public static void main(String args[]){
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Size: " + n + "; Enter the array items:");

        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextDouble();
        }

        max1(array);
    }
}
