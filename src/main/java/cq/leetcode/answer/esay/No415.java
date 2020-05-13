package cq.leetcode.answer.esay;

/**
 * @author qian.cheng
 * 415.字符串相加
 */
public class No415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        if (num1.length() < num2.length()) return addStrings(num2, num1);
        boolean carry = false;
        int i = 0;
        while (i < num1.length()) {
            int sum = num1.charAt(num1.length() - i - 1) - 48;
            if (i < num2.length()) {
                sum += num2.charAt(num2.length() - i - 1) - 48;
            }
            if (carry) {
                sum++;
            }
            carry = sum > 9;
            stringBuilder.append(sum % 10);
            i++;
        }
        if(carry) stringBuilder.append("1");
        return stringBuilder.reverse().toString();
    }
}
