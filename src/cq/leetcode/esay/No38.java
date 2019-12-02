package cq.leetcode.esay;

/**
 * 38.报数
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No38 {
    public static void main(String[] args) {
        for (int i=1;i<=30;i++){
            System.out.println(countAndSay(i));
        }
    }

    private static String countAndSay(int n) {
        if (n==1){
            return "1";
        }
        String s="1";
        for (int i=1;i<n;i++){
            StringBuilder s1= new StringBuilder();
            int num=1;
            String sk="";
            for (int j=0;j<s.length();j++){
                String sj=s.substring(j,j+1);
                if (!sj.equals(sk)){
                    if (!sk.equals("")) s1.append(num).append(sk);
                    sk=s.substring(j,j+1);
                    num=1;
                }else{
                    num++;
                }
                if (j==s.length()-1){
                    s1.append(num).append(sk);
                }
            }
            s=s1.toString();
        }
        return s;
    }
}
