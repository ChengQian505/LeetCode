package cq.leetcode.answer.esay;

/**
 * @author qian.cheng
 * 13.罗马数字转整数
 */
public class No13 {
    private static String[] strings = new String[]{
            "III",
            "IV",
            "IX",
            "LVIII",
            "MCMXCIV"
    };


    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        for (String s : strings) {
            System.out.println(s + "=" + romanToInt(s));
        }
        System.out.println("总耗时:" + (System.currentTimeMillis() - time1) + "ms");
    }

    private static boolean isI_prev = false;
    private static boolean isX_prev = false;
    private static boolean isC_prev = false;

    private static int romanToInt(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            switch (a) {
                case "I":
                    num += 1;
                    isI_prev = true;
                    break;
                case "V":
                    num += 5;
                    if (isI_prev) {
                        num -= 2;
                        rest();
                    }
                    break;
                case "X":
                    num += 10;
                    if (isI_prev) {
                        num -= 2;
                        rest();
                    } else {
                        isX_prev = true;
                    }
                    break;
                case "L":
                    num += 50;
                    if (isX_prev) {
                        num -= 20;
                        rest();
                    }
                    break;
                case "C":
                    num += 100;
                    if (isX_prev) {
                        num -= 20;
                        rest();
                    } else {
                        isC_prev = true;
                    }
                    break;
                case "D":
                    num += 500;
                    if (isC_prev) {
                        num -= 200;
                        rest();
                    }
                    break;
                case "M":
                    num += 1000;
                    if (isC_prev) {
                        num -= 200;
                        rest();
                    }
                    break;
                default:
            }
        }
        return num;
    }

    private static void rest() {
        isI_prev = false;
        isX_prev = false;
        isC_prev = false;
    }
}
