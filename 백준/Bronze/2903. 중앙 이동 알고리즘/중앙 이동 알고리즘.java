import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int dot = (int) Math.pow(2, N) + 1;
        int result = (int) Math.pow(dot, 2);
        
        System.out.println(result);
    }
}