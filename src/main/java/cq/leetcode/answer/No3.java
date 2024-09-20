package cq.leetcode.answer;


import java.util.HashMap;
import java.util.Map;

/**
 * @author qian.cheng
 * 3.无重复字符的最长子串
 */
public class No3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s==null|| "".equals(s)){
            return 0;
        }
        int maxLength=0;
        int left=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (map.containsKey(c)){
                left= Math.max(left,map.get(c)+1);
            }
            map.put(c,i);
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }

}
