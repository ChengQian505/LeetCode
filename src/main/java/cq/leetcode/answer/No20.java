package cq.leetcode.answer;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author qian.cheng
 * 20.有效的括号
 */
public class No20 {

    private static final String[] strings = new String[]{
            "()",
            "()[]{}",
            "(]",
            "([)]",
            "{[]}"
    };

    private static HashMap<Character, Character> mappings;

    public static void main(String[] args) {
        if (mappings == null) {
            mappings = new HashMap<>();
            mappings.put(')', '(');
            mappings.put('}', '{');
            mappings.put(']', '[');
        }
        for (String s : strings) {
            System.out.println(s + " 为" + isValid(s));
        }
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '0' : stack.pop();
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                //如果栈的深度大于字符串长度的1 / 2，就返回false。因为当出现这种情况的时候，即使后面的全部匹配，栈也不会为空。
                if (stack.size() > s.length() / 2) {
                    return false;
                }
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
