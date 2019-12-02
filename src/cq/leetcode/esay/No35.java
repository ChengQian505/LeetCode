package cq.leetcode.esay;

/**
 * @author qian.cheng
 * 35.搜索插入位置
 */
public class No35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},5));
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
        System.out.println(searchInsert(new int[]{1,3,5,6},0));
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums==null||nums.length==0){
            return 0;
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
