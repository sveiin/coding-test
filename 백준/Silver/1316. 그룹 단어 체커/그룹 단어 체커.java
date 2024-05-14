import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        for(int i = 0; i < N; i++) {
            boolean[] arr = new boolean[26];
            boolean isGroupWord = true;
            
            String s = br.readLine();
            
            for(int j = 0; j < s.length(); j++) {
            	char c = s.charAt(j);
                int index = c - 'a';
                
                if(! arr[index]) {
                    arr[index] = true;
                } else if(c != s.charAt(j - 1)){
                	isGroupWord = false;
                    break;
                }
            }
            
            if(isGroupWord) {
                count++;
            }
        }
        
        System.out.println(count);
        br.close();
    }
}