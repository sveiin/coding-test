import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (!list.isEmpty() && list.get(list.size() - 1) == num) {
                list.remove(list.size() - 1);
            } else {
                list.add(num);
            }
        }
        
        if (list.isEmpty()) {
            return new int[] { -1 };
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}