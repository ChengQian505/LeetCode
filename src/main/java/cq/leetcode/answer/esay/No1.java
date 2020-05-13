package cq.leetcode.answer.esay;

import java.util.Arrays;

/**
 * @author qian.cheng
 * 1.两数之和
 */
public class No1 {

    private static int[] s1 = new int[]{
            2, 7, 11, 15
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(s1,9)));
        System.out.println(Arrays.toString(twoSum(s1,13)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] ints=new int[2];
        for (int i=0;i<nums.length;i++){
            for (int j=nums.length-1;j>i;j--){
                if (nums[i]+nums[j]==target){
                    ints[0]=i;
                    ints[1]=j;
                }
            }
        }
        return ints;
    }
}
