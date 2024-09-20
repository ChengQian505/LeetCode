package cq.leetcode.answer;

/**
 * @author qian.cheng
 * 58.最后一个单词的长度
 */
public class No58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    private static int lengthOfLastWord(String s) {
        s=s.trim();
        int a=s.lastIndexOf(" ");
        if (a<0){
            return s.length();
        }
        return s.length()-a-1;
    }

}
