import java.util.*;

class Solution {
    public List solution(int[] arr, int[] deleteList) {
        List<Integer> result = new ArrayList<>();
        
        for (int a : arr) {
            result.add(a);
        }
        
        for (int d : deleteList) {
            result.remove(Integer.valueOf(d));
        }
        
        return result;
    }
}