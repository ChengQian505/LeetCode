package cq.leetcode.answer;

/**
 * @author qian.cheng
 * 28.实现strStr()
 */
public class No28 {

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bba"));
    }

    private static int strStr(String haystack, String needle) {
        if (needle==null|| "".equals(needle)){
            return 0;
        }
        if (haystack==null|| "".equals(haystack)){
            return -1;
        }
        return haystack.indexOf(needle);
    }

}
