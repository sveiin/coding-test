import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        if(minute >= 45) {
           minute -= 45;
        } else {
            minute = (60 + minute) - 45;
            if(hour >= 1) {
                hour--;
            } else {
                hour = 23;
            }
        }
        
        System.out.printf("%d %d", hour, minute);
    }
}