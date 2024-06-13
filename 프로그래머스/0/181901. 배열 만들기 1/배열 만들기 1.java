import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        
        Integer[] temp = list.toArray(new Integer[0]);
            
        int[] result = new int[temp.length];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
