import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        Map<String, Character> morseMap = new HashMap<>();
        String[] arr = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..", 
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", 
            "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        
        for (int i = 0; i < arr.length; i++) {
            morseMap.put(arr[i], (char) ('a' + i));
        }
        
        String[] splits = letter.split(" ");
        StringBuilder sb = new StringBuilder(splits.length);
        
        for (String str : splits) {
            sb.append(morseMap.get(str));
        }
        
        return sb.toString();
    }
}