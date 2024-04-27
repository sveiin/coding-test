import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int t = sc.nextInt();
        
        int[] arr = new int[arrNum];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        for(int i = 0; i < t; i++) {
            int index1 = sc.nextInt() - 1;
            int index2 = sc.nextInt() - 1;
            
            int basketsNum = index2 - index1 + 1;
            for(int j = 0; j < basketsNum / 2; j++) {
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
                index1++;
                index2--;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}