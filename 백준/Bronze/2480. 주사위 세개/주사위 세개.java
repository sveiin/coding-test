import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int money;
            
        if(num1 == num2 && num2 == num3) {
            money = 10000 + num1 * 1000;
        } else if(num1 == num2) {
            money = 1000 + num1 * 100;
        } else if(num1 == num3 || num2 == num3) {
            money = 1000 + num3 * 100;
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            money = max * 100;
        }
        
        System.out.println(money);
    }
}