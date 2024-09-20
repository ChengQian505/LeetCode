package cq.leetcode.answer;


/**
 * @author qian.cheng
 * 680. 验证回文字符串 Ⅱ
 */
public class No680 {

    boolean d=true;

    public boolean validPalindrome(String s) {
        int mid=s.length()>>1;
        for (int i=0;i<mid;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                if (!d){
                    return false;
                }
                d=false;
                if (!validPalindrome(s.substring(i+1,s.length()-i))){
                    return validPalindrome(s.substring(i,s.length()-i-1));
                }
                return true;
            }
        }
        return true;
    }
}
