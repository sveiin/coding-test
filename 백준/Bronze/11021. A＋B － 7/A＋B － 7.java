import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testNum = sc.nextInt();
        
        for(int i = 1; i <= testNum; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i, (num1 + num2));
        }
    }
}