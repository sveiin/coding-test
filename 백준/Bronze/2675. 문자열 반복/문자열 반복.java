import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testNum = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < testNum; i++) {
            String str = sc.nextLine();
            
            int num = Integer.parseInt(str.split(" ")[0]);
            String s = str.split(" ")[1];
            
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < num; k++) {
                    System.out.print(s.split("")[j]);
                }
            }
            System.out.println();
        }   
        
    }
}