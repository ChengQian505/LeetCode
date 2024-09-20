package cq.leetcode.answer;

import cq.leetcode.ProgressWatch;

/**
 * @author qian.cheng
 * 7.整数反转
 */
public class No7 extends ProgressWatch {

    private static int reverse(int x) {
        boolean positiveNumber=false;
        if (x>0){
            positiveNumber=true;
            x=-x;
        }
        int num=0;
        while(x!=0){
            if (num<Integer.MIN_VALUE/10||(num==Integer.MIN_VALUE/10&&x%10==-8)){
                return 0;
            }
            num=num*10+x%10;
            x=x/10;
        }
        if(positiveNumber){
            num=-num;
        }
        return num;
    }

    @Override
    public void test() {
        execute(1534236469);
        execute(-123);
        execute(120);
    }

    @Override
    protected Object run(Object... object) {
        return reverse((Integer) object[0]);
    }
}
