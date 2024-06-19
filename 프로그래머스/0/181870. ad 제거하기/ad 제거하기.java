import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] arr) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("ad")) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}