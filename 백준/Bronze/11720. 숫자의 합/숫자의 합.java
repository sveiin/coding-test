import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = Integer.parseInt(sc.nextLine());
        String[] arr = sc.nextLine().split("");
        
        int sum = 0;
        for(int i = 0; i < arrNum; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        
        System.out.println(sum);
    }
}