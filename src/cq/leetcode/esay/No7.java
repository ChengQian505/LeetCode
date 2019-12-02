package cq.leetcode.esay;

/**
 * 7.整数反转
 */
public class No7 {


    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }

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
}
