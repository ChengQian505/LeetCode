package cq.leetcode.esay;

/**
 * @author qian.cheng
 * 14.最长公共前缀
 */
public class No14 {

    private static String[] s1 = new String[]{
            "flower", "flow", "flight"
    };

    private static String[] s2 = new String[]{
            "dog","racecar","car"
    };

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(s1));
        System.out.println(longestCommonPrefix(s2));
    }

    private static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            String v = strs[0].substring(i, i + 1);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length()==i){
                    return a.toString();
                }
                String js=strs[j].substring(i, i + 1);
                if (j != 0 && !js.equals(v)) {
                    return a.toString();
                }
                if (j == strs.length - 1) {
                    a.append(v);
                }
            }
        }
        return a.toString();
    }
}
