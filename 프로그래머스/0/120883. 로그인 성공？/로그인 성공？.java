class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        for (String[] account : db) {
            if (id_pw[0].equals(account[0])) {
                return id_pw[1].equals(account[1]) ? "login" : "wrong pw";
            }
        }
        
        return "fail";
    }
}