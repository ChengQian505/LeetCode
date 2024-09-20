package cq.leetcode.answer;


/**
 * @author qian.cheng
 * 239.滑动窗口最大值
 *
 * 当前为暴力法，等知识补充之后进行升级
 */
public class No239 {


    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ints=new int[nums.length-k+1];
        int i=0;
        while (i<nums.length-k+1){
            int j=0;
            int tempMax=nums[i];
            while(j<k){
                tempMax=Math.max(tempMax,nums[i+j]);
                j++;
            }
            ints[i]=tempMax;
            i++;
        }
        return ints;
    }
}
