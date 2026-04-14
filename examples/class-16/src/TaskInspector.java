class Inspector{
    <T> void search(T[] arr, T target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                System.out.println("Found: " + arr[i]);
                System.out.println("Index: " + i);
                return;
            }
        }
    }
}

public class TaskInspector {
    public static void main(String[] args) {
        String[] arr = {"AB", "CD", "EF"};
        Inspector ob = new Inspector();
        ob.search(arr, "AB");
        ob.search(arr, "EF");
    }
}
