import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            int num = i;
            boolean isValid = true;
            
            while (num > 0) {
                int digit = num % 10;
                if (digit != 0 && digit != 5) {
                    isValid = false;
                    break;
                }
                num /= 10;
            }
            
            if (isValid) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            return new int[] { -1 };
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}