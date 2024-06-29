import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] todoList, boolean[] isFinished) {
        ArrayList<String> result = new ArrayList<>();
        
        for (int i = 0; i < todoList.length; i++) {
            if (!isFinished[i]) {
                result.add(todoList[i]);
            }
        }
        
        return result;
    }
}