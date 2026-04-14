class S{
    <T> void search(T[] arr){
        for(T b: arr){
            System.out.println(b);
        }
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        S ob1 = new S();
        Integer arr1[] = {1,2,3};
        Character arr2[] = {'A', 'B', 'C'};

        ob1.search(arr1);
        ob1.search(arr2);
    }
}
