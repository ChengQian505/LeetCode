package cq.leetcode.medium;

/**
 * @author qian.cheng
 * 43.字符串相乘
 *
 */
public class No43 {

    /**
     *
     * 这里是我们计算的基本方式，以下算法参考此内容
     *    123
     *   * 22
     *   ----
     *    246
     *   246
     *   ----
     *   2706
     */
    public String multiply(String num1, String num2) {
        if (num1.length()<num2.length()) return multiply(num2,num1);
        //这里会采用数字逆序，之后再逆序拿到真正的数字
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <num1.length(); i++) {
            //乘数的每一位
            int tempnum1 = Integer.parseInt(String.valueOf(num1.charAt(num1.length()-1-i)));
            for (int j = 0; j <num2.length(); j++) {
                //被乘数的每一位
                int tempnum2 = Integer.parseInt(String.valueOf(num2.charAt(num2.length()-1-j)));
                //乘数的一位*被乘数的一位
                String sum = tempnum1 * tempnum2+"";
                for (int k=0;k<sum.length(); k++){
                    int tempsum = Integer.parseInt(String.valueOf(sum.charAt(sum.length()-1-k)));
                    //添加当前位数字到对应的进制位
                    add(stringBuilder,tempsum,i+j+k);
                }
            }
        }
        int index=stringBuilder.length();
        while(stringBuilder.charAt(index-1)=="0".charAt(0)&&index!=1){
            index--;
        }
        //逆序拿到真正的数字
        return stringBuilder.reverse().substring(stringBuilder.length()-index,stringBuilder.length());
    }

    /**
     * 加法递归运算
     * @param stringBuilder 存放数字的字符串
     * @param value 要加的值
     * @param index 要加的进制位
     */
    public void add(StringBuilder stringBuilder, int value, int index){
        //如果当前进制位有数字，则需要将要加的值加上该进制位数字
        if (index<stringBuilder.length()){
            value+=stringBuilder.charAt(index)-48;
        }
        //需要进位的数字
        int carry=value/10;
        //不需要进位的数字
        int num_present=value%10;
        //如果当前进制位有数字，替换掉，如果没有则增加一位
        if (index<stringBuilder.length()){
            stringBuilder.replace(index,index+1,num_present+"");
        }else{
            stringBuilder.append(num_present);
        }
        //如果需要进位则递归
        if (carry>0){
            add(stringBuilder, carry, index+1);
        }
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("531100");
        stringBuilder.substring(0,4);
        System.out.println(stringBuilder.toString());
    }

}
