package cq.leetcode.answer;

import cq.leetcode.LeetCode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/average-value-of-even-numbers-that-are-divisible-by-three/">问题链接</a>
 */
public class No2455 implements LeetCode {
    @Override
    public void test() {
        int[] nums1 = new int[]{1, 3, 6, 10, 12, 15};
        int[] nums2 = new int[]{1, 2, 4, 7, 10};
        System.out.println(averageValue(nums1));
        System.out.println(averageValue(nums2));
    }

    public int averageValue(int[] nums) {
        return (int)Arrays.stream(nums).filter(x -> x % 6 == 0).average().orElse(0);
    }


}
