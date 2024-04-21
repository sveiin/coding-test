import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt() / 4;
        String s = "";
            
        for(int i = 0; i < num; i++) {
            s += "long ";
        }
        s += "int";
        
        System.out.println(s);
    }
}