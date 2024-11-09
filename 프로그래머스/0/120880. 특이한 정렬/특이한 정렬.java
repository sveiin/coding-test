import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int n) {
        return Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> {
                    int diffA = Math.abs(a - n);
                    int diffB = Math.abs(b - n);
                    
                    if (diffA == diffB) {
                        return b - a;
                    }
                    
                    return diffA - diffB;
                })
                .mapToInt(i -> i)
                .toArray();
    }
}