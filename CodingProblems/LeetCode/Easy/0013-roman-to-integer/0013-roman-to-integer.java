class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        if (s.length() == 1) {
            return map.get(s);
        }

        int rtnNum = 0;
        for (int i = 1; i < s.length(); i++) {
            int preNum = map.get(Character.toString(s.charAt(i - 1)));
            int nextNum = map.get(Character.toString(s.charAt(i)));
            
            if (preNum >= nextNum) {
                rtnNum += preNum;
            } else {
                rtnNum -= preNum;
            }

            if (s.length() - 1 == i) {
                rtnNum += nextNum;
            }
        }
        return rtnNum;
    }
}