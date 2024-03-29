import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];
        int count = 0;
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int searchNum = sc.nextInt();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchNum) {
                count++;
            }
        }
        
        System.out.print(count);
    }
}