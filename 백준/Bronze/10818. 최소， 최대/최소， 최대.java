import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.printf("%d %d", min, max);
    }
}