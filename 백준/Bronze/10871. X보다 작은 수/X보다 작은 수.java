import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];
        int x = sc.nextInt();
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}