import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int index = Integer.parseInt(sc.nextLine()) - 1;
        
        System.out.println(s.charAt(index));
    }
}