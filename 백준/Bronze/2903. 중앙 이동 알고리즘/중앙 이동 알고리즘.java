import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int num = 2;
        int count = 1;
        for(int i = 1; i <= N; i++) {
            num += count;
            count *= 2;
        }
        
        int result = num * num;
        
        System.out.println(result);
    }
}