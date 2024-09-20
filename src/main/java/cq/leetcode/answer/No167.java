package cq.leetcode.answer;

/**
 * @author qian.cheng
 * 167.两数之和 II - 输入有序数组
 */
public class No167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ints=new int[2];
        int x=0,y=0;
        while(x<numbers.length){
            while (y<numbers.length){
                if (x<y) {
                    if (numbers[x]+numbers[y]==target){
                        ints[0]=x+1;
                        ints[1]=y+1;
                        return ints;
                    }
                }
                y++;
            }
            x++;
            y=0;
        }
        return ints;
    }
}
