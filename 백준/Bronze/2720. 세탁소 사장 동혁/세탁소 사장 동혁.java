import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        for(int i = 0; i < t; i++) {
            int change = sc.nextInt();
            
            System.out.print((change / quarter) + " ");
            change %= quarter;
            
            System.out.print((change / dime) + " ");
            change %= dime;
            
            System.out.print((change / nickel) + " ");
            change %= nickel;
            
            System.out.println(change);
        }
    }
}