import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == 'A' || c == 'B' || c == 'C') {
                sum += 3;
            } else if(c == 'D' || c == 'E' || c == 'F') {
                sum += 4;
            } else if(c == 'G' || c == 'H' || c == 'I') {
                sum += 5;
            } else if(c == 'J' || c == 'K' || c == 'L') {
                sum += 6;
            } else if(c == 'M' || c == 'N' || c == 'O') {
                sum += 7;
            } else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                sum += 8;
            } else if(c == 'T' || c == 'U' || c == 'V') {
                sum += 9;
            } else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                sum += 10;
            }
        }
        
        System.out.println(sum);
    }
}