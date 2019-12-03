package cq.leetcode.esay;

/**
 * @author qian.cheng
 * 53.最大子序和
 */
public class No53 {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    private static int maxSubArray(int[] nums) {
        int sum1=nums[0];
        int sum2=0;
        for (int num:nums){
            //判断之前的和为负数或正数
            if (sum2>0){
                //正数的话加当前数
                sum2+=num;
            }else{
                //负数的话等于当前数
                sum2=num;
            }
            //之前的数和现在的数取其大
            sum1=Math.max(sum1,sum2);
        }
        return sum1;
    }

}
