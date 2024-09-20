package cq.leetcode.answer;

/**
 * @author qian.cheng
 * 67.二进制求和
 */
public class No67 {

    public String addBinary(String a, String b) {
        int length = Math.max(a.length(), b.length());
        StringBuilder stringBuffer=new StringBuilder();
        boolean in=false;
        for (int i=0;i<length;i++){
            int sum=getString(a, a.length()-i-1)+getString(b, b.length()-i-1);
            if (in) {
                sum=sum+1;
            }
            if (sum>=2){
                in=true;
                sum=sum-2;
            }else{
                in=false;
            }
            stringBuffer.append(sum);
            if (in&&i==length-1){
                stringBuffer.append("1");
            }
        }
        return stringBuffer.reverse().toString();
    }

    private int getString(String b, int i) {
        int y;
        if (i <0) {
            y = 0;
        } else {
            y = Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        return y;
    }

}
