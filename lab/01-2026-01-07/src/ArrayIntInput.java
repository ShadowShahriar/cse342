import java.util.*;

public class ArrayIntInput {
    public static void main(String[] args){

        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Size: " + n + "; Enter the array items:");

        int array[] = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Array items:");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
