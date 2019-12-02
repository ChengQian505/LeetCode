package cq.leetcode.medium;

/**
 * @author qian.cheng
 * 29.两数相除
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
