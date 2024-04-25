import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        String newStr1 = "";
        String newStr2 = "";
        
        for(int i = s1.length() - 1; i >= 0; i--) {
            newStr1 += s1.split("")[i];
            newStr2 += s2.split("")[i];
        }
        
        int num1 = Integer.parseInt(newStr1);
        int num2 = Integer.parseInt(newStr2);
            
        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}