import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ranks, boolean[] attendances) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < ranks.length; i++) {
            if (attendances[i]) {
                list.add(i);
            }
        }

        list.sort((a, b) -> Integer.compare(ranks[a], ranks[b]));

        int a = list.get(0);
        int b = list.get(1);
        int c = list.get(2);

        return 10000 * a + 100 * b + c;
    }
}