import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int i = 1; i <= t; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i, num1, num2, (num1+num2));
        }
        
    }
}