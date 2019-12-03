package cq.leetcode.esay;

import java.util.Arrays;

/**
 * @author qian.cheng
 * 66.加一
 */
public class No66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{4,3,2,1})));
    }

    private static int[] plusOne(int[] digits) {
        int index=digits.length-1;
        //检查当前位是否是9
        while (digits[index]==9){
            //如果第一位是9,那么需要扩充数组
            if (index==0){
                //数组长度+1
                int[] tempArgs=new int[digits.length+1];
                //将之前数组复制到新数组
                System.arraycopy(digits, 0, tempArgs, 1, digits.length);
                //切换当前数组为新数组
                digits=tempArgs;
                //改变检查的下标
                index=1;
            }else{
                //改变当前位的值为0
                digits[index]=0;
                //检查上一位
                index=index-1;
            }
        }
        //当前为不为9，+1即可
        digits[index]=digits[index]+1;
        return digits;
    }

}
