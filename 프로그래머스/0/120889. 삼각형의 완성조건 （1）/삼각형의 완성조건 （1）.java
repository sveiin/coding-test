import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {        
        int[] arr = Arrays.copyOf(sides, sides.length);
        
        Arrays.sort(arr);
        
        return (arr[2] < arr[0] + arr[1]) ? 1 : 2;
        
    }
}