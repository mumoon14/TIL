class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sLen = s.length();
        int rtnNum = 0;
        for (int i = 0; i < sLen; i++) {
            int preNum = map.get(s.charAt(i));
            if (sLen - 1 == i) {
                rtnNum += preNum;
                return rtnNum;
            }
            int nextNum = map.get(s.charAt(i + 1));
            if (preNum >= nextNum) {
                rtnNum += preNum;
            } else {
                rtnNum -= preNum;
            }
        }
        return rtnNum;
    }
}