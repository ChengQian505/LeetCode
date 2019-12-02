package cq.leetcode.esay;

/**
 * 38.报数
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
