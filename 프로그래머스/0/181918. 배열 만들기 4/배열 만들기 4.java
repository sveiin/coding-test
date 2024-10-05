import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            while (!list.isEmpty() && list.get(list.size() - 1) >= num) {
                list.remove(list.size() - 1);
            }
            list.add(num);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}