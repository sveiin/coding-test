import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int result = 1;
        for(int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(c1 != c2) {
                result = 0;
                break;
            }
        }
        
        System.out.println(result);
    }
}