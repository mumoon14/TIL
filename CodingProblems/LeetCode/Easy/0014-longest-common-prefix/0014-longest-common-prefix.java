class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        boolean isBreak = false;
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (String s : strs) {
                if (s.indexOf(sb.toString()) != 0) {
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }
        if(sb.length() > 0 && strs.length > 1 && isBreak == true) sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}