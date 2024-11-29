import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredients) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        for (int item : ingredients) {
            list.add(item);

            int size = list.size();
            if (size >= 4 &&
                list.get(size - 4) == 1 &&
                list.get(size - 3) == 2 &&
                list.get(size - 2) == 3 &&
                list.get(size - 1) == 1) {

                count++;
                list.subList(size - 4, size).clear();
            }
        }

        return count;
    }
}