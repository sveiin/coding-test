import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] keywords = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        String s = br.readLine();
        
        for(int i = 0; i < keywords.length; i++) {
        	if(s.contains(keywords[i])) {
        		s = s.replace(keywords[i], "!");
        	}
        }
        
        bw.write(String.valueOf(s.length()));
        
        br.close();
        bw.flush();
        bw.close();
    }
}