package cq.leetcode.answer.esay;

/**
 * @author qian.cheng
 * 69.x的平方根
 */
public class No69 {
    /**
     * 二分查找-除中位数
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if(x == 1)
            return 1;
        int min = 0;
        int max = x;
        while(max-min>1)
        {
            int m = (max+min)/2;
            if(x/m<m)
                max = m;
            else
                min = m;
        }
        return min;
    }

    /**
     * 二分查找-中位数相乘找
     * @param x
     * @return
     */
    public int mySqrt1(int x) {
        long left=0;
        long right=x;
        while(left<right){
            //无符号左移一位，正数就是除以2
            long mid=(left+right+1)/2;
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
