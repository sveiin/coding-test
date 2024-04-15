import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testNum = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < testNum; i++) {
            String s = sc.nextLine();
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length() - 1);
            System.out.println("" + firstChar + lastChar);
        }
    }
}