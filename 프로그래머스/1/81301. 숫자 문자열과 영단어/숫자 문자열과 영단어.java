class Solution {
    public int solution(String str) {
        String[] words = {
            "zero", "one", "two", "three",
            "four", "five", "six", "seven",
            "eight", "nine"
        };
        
        for (int i = 0; i < words.length; i++) {
            str = str.replace(words[i], String.valueOf(i));
        }
        
        return Integer.parseInt(str);
    }
}