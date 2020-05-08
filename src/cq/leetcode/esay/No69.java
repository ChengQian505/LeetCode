package cq.leetcode.esay;

/**
 * @author qian.cheng
 * 69.x的平方根
 */
public class No69 {
    //二分查找
    public int mySqrt(int x) {
        long left=0;
        long right=x;
        while(left<right){
            //右移一位等于除以2的效果
            long mid=(left+right+1)>>1;
            long square=mid*mid;
            if (square>x){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return (int) left;
    }

}
