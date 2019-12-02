package cq.leetcode.esay;

/**
 * 9.回文数
 * 与第7题解法一样
 */
public class No9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    private static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }else if (x==0){
            return true;
        }
        int y=x;
        int num=0;
        while(x!=0){
            num=num*10+x%10;
            x=x/10;
        }
        return y == num;
    }
}
