import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < N.length(); i++) {
        	char c = N.charAt(i);
        	
        	int num;
        	if(c >= '0' && c <= '9') {
        		num = c - '0';
        	} else {        		
        		num = c - 'A' + 10;
        	}
            
            sum += num * Math.pow(B, N.length() - 1 - i);
        }
        
        System.out.println(sum);
        
        sc.close();
            
    }
}