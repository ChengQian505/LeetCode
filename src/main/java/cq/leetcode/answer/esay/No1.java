package cq.leetcode.answer.esay;

import cq.leetcode.ProgressWatch;

/**
 * @author qian.cheng
 * 1.两数之和
 */
public class No1 extends ProgressWatch {

    private static final int[] s1 = new int[]{
            2, 7, 11, 15
    };

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

    @Override
    public void test() {
        execute(s1,9);
        execute(s1,9);
    }

    @Override
    protected Object run(Object... object) {
        return twoSum((int[])object[0],(int)object[1]);
    }
}
