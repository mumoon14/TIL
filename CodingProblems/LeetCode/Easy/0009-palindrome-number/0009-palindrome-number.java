class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String numStr = String.valueOf(x);
        String reverseNumStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            reverseNumStr = reverseNumStr + numStr.charAt(i);
        }
        if (numStr.equals(reverseNumStr)) {
            return true;
        }
        return false;
    }
}