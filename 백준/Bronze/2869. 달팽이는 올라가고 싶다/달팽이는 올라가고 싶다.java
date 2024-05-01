import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        int count = (v - a) / (a - b);
        
        if ((v - a) % (a - b) == 0) {
        	count += 1;
        } else {
        	count += 2;
        }

        System.out.println(count);
    }
}