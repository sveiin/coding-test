import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int arrNum = 'z' - 'a' + 1;
        int[] arr = new int[arrNum];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        
        for(int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i) - 'a';
            if(arr[index] == -1) {
                arr[index] = i;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}