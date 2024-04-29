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

        List<Integer> list = new ArrayList<>();
        for (String ss : s.split("")) {
            list.add(map.get(ss));
        }

        int rtnNum = 0;

        if (list.size() == 1) {
            return list.get(0);
        }

        for (int i = 1; i < list.size(); i++) {
            int preNum = list.get(i - 1);
            int nextNum = list.get(i);
            
            if (preNum >= nextNum) {
                rtnNum += preNum;
            } else {
                rtnNum -= preNum;
            }

            if (list.size() - 1 == i) {
                rtnNum += nextNum;
            }
        }
        return rtnNum;
    }
}