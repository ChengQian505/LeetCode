package cq.leetcode.hard;

import java.util.Arrays;

/**
 * @author qian.cheng
 * 4.寻找两个正序数组的中位数
 */
public class No4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        int half = (nums.length + 1) / 2;
        if (nums.length % 2 == 0) {
            return (double) (nums[half-1] + nums[half]) /2;
        } else {
            return nums[half-1];
        }
    }
}
