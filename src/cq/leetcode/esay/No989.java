package cq.leetcode.esay;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 */
public class No989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder stringBuilder=new StringBuilder();
        String sNum2=String.valueOf(K);
        int length = Math.max(A.length, sNum2.length());
        boolean carry=false;
        for (int i=0;i<length;i++){
            int num1,num2;
            if (i<A.length){
                num1=A[A.length-i-1];
            }else{
                num1=0;
            }
            if (i<sNum2.length()){
                num2=sNum2.charAt(sNum2.length()-i-1)-48;
            }else{
                num2=0;
            }
            int num=num1+num2;
            if (carry){
                num++;
            }
            carry= num >= 10;
            stringBuilder.append(num%10);
        }
        if (carry){
            stringBuilder.append(1);
        }
        String s=stringBuilder.reverse().toString();
        List<Integer> integerList=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            integerList.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        return integerList;
    }
}
