package cq.leetcode.medium;

/**
 * 29.两数相除
 * <p>
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * <p>
 * 示例 1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 说明:
 * <p>
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No29 {
    public static void main(String[] args) {
        System.out.println(divide(-10, -3));
    }

    private static int divide(int dividend, int divisor) {
        boolean sign = 0 < dividend ^ 0 < divisor;
        if (0<dividend){
            dividend=-dividend;
        }
        if (0<divisor){
            divisor=-divisor;
        }
        int result = dividend / divisor;
        if (!sign&&result == Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        }else{
            return !sign?result:-result;
        }
    }
}
