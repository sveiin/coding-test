import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String str) {
        String[] tempArr = str.split("[abc]");
        List<String> list = new ArrayList<>();
        
        for (String s : tempArr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        
        return list.isEmpty() ? new String[] { "EMPTY" } : list.toArray(new String[0]);
    }
}