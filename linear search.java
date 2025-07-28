import java.util.*;
public class LineraSearch {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == target) {
                System.out.println("Target found at index of " + i);
                return;
            }
        }
        System.out.println("not found");
    }
}
