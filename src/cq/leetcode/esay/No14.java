package cq.leetcode.esay;

/**
 * 14.最长公共前缀
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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
