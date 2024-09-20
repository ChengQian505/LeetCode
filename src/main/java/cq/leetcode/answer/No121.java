package cq.leetcode.answer;

/**
 * @author qian.cheng
 * 121. 买卖股票的最佳时机
 */
public class No121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }

    private static int maxProfit(int[] prices) {
        if (prices==null||prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int pro = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                // 更新最小值
                min = prices[i];
            } else if (prices[i] > min) {
                int temp = prices[i] - min;
                // 如果大于之前的利润 再更新利润
                if (temp > pro) {
                    pro = temp;
                }
            }
        }
        return pro;
    }
}
