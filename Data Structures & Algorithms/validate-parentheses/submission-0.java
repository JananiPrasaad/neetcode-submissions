class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        // Use ArrayDeque as a LIFO Stack
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            // Step 1: Push open brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Step 2: Handle closing brackets
            else {
                // If we hit a closing bracket but the stack is empty, it's invalid!
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check if the popped bracket matches the closing bracket type
                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }

        // Step 3: If the stack is completely empty, all brackets were properly matched!
        return stack.isEmpty();
    }
}
