class Solution {
    public int romanToInt(String s) {
        int sLen = s.length();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if (sLen == 1) {
            return map.get(s.charAt(0));
        }
        int rtnNum = 0;
        for (int i = 1; i < sLen; i++) {
            int preNum = map.get(s.charAt(i - 1));
            int nextNum = map.get(s.charAt(i));
            
            if (preNum >= nextNum) {
                rtnNum += preNum;
            } else {
                rtnNum -= preNum;
            }

            if (sLen - 1 == i) {
                rtnNum += nextNum;
            }
        }
        return rtnNum;
    }
}