class Solution {
    public boolean isValid(String s) {
        while (s.indexOf("()") != -1 || s.indexOf("[]") != -1 || s.indexOf("{}") != -1) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }
        return s.length() == 0 ? true : false;
    }
}