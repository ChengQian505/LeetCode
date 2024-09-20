package cq.leetcode.answer;

import cq.leetcode.LeetCode;

import java.util.Arrays;

public class No724 implements LeetCode {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (0 == total - 2 * sum - nums[i]) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

    @Override
    public void test() {
        int[] ints1 = new int[]{1, 7, 3, 6, 5, 6};
        int[] ints2 = new int[]{1, 2, 3};
        int[] ints3 = new int[]{2, 1, -1};
        System.out.println(pivotIndex(ints1));
        System.out.println(pivotIndex(ints2));
        System.out.println(pivotIndex(ints3));

    }
}
