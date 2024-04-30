class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];
        int minLen = Math.min(firstStr.length(), lastStr.length());

        int prefixIdx = 0;
        for (int i = 0; i < minLen; i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) {
                prefixIdx++;
                continue;
            }
            break;
        }

        return firstStr.substring(0, prefixIdx);
    }
}