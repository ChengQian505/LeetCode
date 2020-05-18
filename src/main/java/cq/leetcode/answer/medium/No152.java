package cq.leetcode.answer.medium;

import org.springframework.stereotype.Component;

/**
 * @author qian.cheng
 * 152. 乘积最大子数组
 */
@Component
public class No152 {
    public int maxProduct(int[] nums) {
        int sum_=nums[0];
        for (int i=0;i<nums.length;i++){
            int sum=1;
            for (int j=i;j>=0;j--){
                sum_=Math.max(sum*=nums[j],sum_);
            }
        }
        return sum_;
    }
}
