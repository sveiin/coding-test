import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arrNum = sc.nextInt();
        int[] scores = new int[arrNum];
        double[] newScores = new double[arrNum];
        
        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
       
        int max = scores[0];
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
            }
        }
        
        double sum = 0;
        for(int i = 0; i < newScores.length; i++) {
            newScores[i] = (double) scores[i] / max * 100; 
            sum += newScores[i];
        }
        
        double avg = sum / newScores.length;
        
        System.out.println(avg);
    }
}