import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            if (currentWord.charAt(0) != lastChar || usedWords.contains(currentWord)) {
                int person = (i % n) + 1;
                int turn = (i / n) + 1;
                return new int[] { person, turn };
            }

            usedWords.add(currentWord);
            lastChar = currentWord.charAt(currentWord.length() - 1);
        }

        return new int[]{0, 0};
    }
}