import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int testNum = sc.nextInt();
        
        int[] arr = new int[arrNum];
        
        for(int i = 0; i < testNum; i++) {
            int index1 = sc.nextInt() - 1;
            int index2 = sc.nextInt() - 1;
            int ballNum = sc.nextInt();
            
            for(int j = index1; j <= index2; j++) {
                arr[j] = ballNum;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}