import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            days.offer(day);
        }

        while (!days.isEmpty()) {
            int current = days.poll();
            int count = 1;

            while (!days.isEmpty() && days.peek() <= current) {
                days.poll();
                count++;
            }

            results.add(count);
        }

        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}