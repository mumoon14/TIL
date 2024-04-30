class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c2 = stack.peek();
                if ((c2 == '(' && c == ')') || (c2 == '[' && c == ']') || (c2 == '{' && c == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}