import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int testNum = sc.nextInt();
        
        int[] arr = new int[arrNum];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        for(int i = 0; i < testNum; i++) {
            int num1 = sc.nextInt() - 1;
            int num2 = sc.nextInt() - 1;
            int temp;
            
            temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}