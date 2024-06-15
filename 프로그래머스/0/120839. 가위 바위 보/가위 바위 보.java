class Solution {
    public String solution(String rsp) {
        String result = "";
    
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            
            switch (c) {
                case '0':
                    result += '5';
                    break;
                case '2':
                    result += '0';
                    break;
                default:
                    result += '2';
            }
        }
        
        return result;
    }
}