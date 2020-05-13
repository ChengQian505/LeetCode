package cq.leetcode.answer.esay;


/**
 * @author qian.cheng
 * 26.删除排序数组中的重复项
 */
public class No26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    private static int removeDuplicates(int[] nums) {
        int length = 0;
        if (nums == null||nums.length==0) {
            return length;
        }
        int lastNum = nums[0];
        length++;
        for (int num : nums) {
            if (lastNum != num) {
                lastNum = num;
                nums[length] = lastNum;
                length++;
            }
        }
        return length;
    }

}
