package cq.leetcode.answer.esay;

import java.util.Arrays;

/**
 * @author qian.cheng
 * 27.移除元素
 */
public class No27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }

    private static int removeElement(int[] nums, int val) {
        int length=0;
        if (nums==null||nums.length==0){
            return length;
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                nums[length]=nums[i];
                length++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }

}
