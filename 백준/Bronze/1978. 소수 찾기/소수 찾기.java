import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean isPrime = true;
            
            if(num == 1) {
            	continue;
            }
            
            for(int j = 2; j < num; j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            
            if(isPrime) {
            	count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}