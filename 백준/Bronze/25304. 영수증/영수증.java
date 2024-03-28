import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int priceReceipt = sc.nextInt();
        int numTest = sc.nextInt();
        int priceReal = 0;
        
        for(int i = 0; i < numTest; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            priceReal += (price * num);
        }
        
        if(priceReceipt == priceReal) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}