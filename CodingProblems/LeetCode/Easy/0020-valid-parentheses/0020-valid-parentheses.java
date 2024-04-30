class Solution {
    public boolean isValid(String s) {
        do {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (s.indexOf("()") != -1 || s.indexOf("[]") != -1 || s.indexOf("{}") != -1);
        return s.length() == 0 ? true : false;
    }
}