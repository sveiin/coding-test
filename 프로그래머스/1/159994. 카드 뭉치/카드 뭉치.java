class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {      
        int index1 = 0;
        int index2 = 0;
        int length1 = cards1.length;
        int length2 = cards2.length;
        
        for (String str : goal) {
            if (index1 < length1 && str.equals(cards1[index1])) {
                index1++;
            } else if (index2 < length2 && str.equals(cards2[index2])) {
                index2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}