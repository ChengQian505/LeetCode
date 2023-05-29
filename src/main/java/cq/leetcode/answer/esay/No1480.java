package cq.leetcode.answer.esay;

import cq.leetcode.answer.LeetCode;

import java.util.Arrays;

/**
 * 0 ms	41.2 MB
 */
public class No1480 implements LeetCode {

    public int[] runningSum(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < ints.length; i++) {
            if (i == 0) {
                ints[i] = nums[i];
            } else {
                ints[i] = nums[i] + ints[i - 1];
            }
        }
        return ints;
    }

    @Override
    public void test() {
        int[] ints1 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(ints1)));
        int[] ints2 = new int[]{1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(runningSum(ints2)));
        int[] ints3 = new int[]{3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(runningSum(ints3)));
    }
}
