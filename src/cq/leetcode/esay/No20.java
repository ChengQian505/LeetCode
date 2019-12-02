package cq.leetcode.esay;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20.有效的括号
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No20 {

    private static String[] strings = new String[]{
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
