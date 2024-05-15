import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] arr = new char[5][];
        
        int maxIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            String s = br.readLine();
            int len = s.length();
            
            if(len > maxIndex) {
                maxIndex = len;
            }
            
            arr[i] = new char[len];
            
            for(int j = 0; j < len; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        
        for(int i = 0; i < maxIndex; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].length <= i) {
                    continue;
                }
                
                bw.write(String.valueOf(arr[j][i]));
            }
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}