import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}