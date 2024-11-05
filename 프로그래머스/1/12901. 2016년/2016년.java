class Solution {
    public String solution(int month, int date) {
        String[] daysOfWeek = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
        int[] daysInMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        int totalDays = date;
        
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }
        
        return daysOfWeek[totalDays % 7];
    }
}