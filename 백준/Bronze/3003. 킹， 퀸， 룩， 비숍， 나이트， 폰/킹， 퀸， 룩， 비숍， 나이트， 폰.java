import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] blackPieces = {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i < blackPieces.length; i++) {
            int num = sc.nextInt();
            System.out.print((blackPieces[i] - num) + " ");
        }
    }
}