package cq.leetcode;

import cq.leetcode.hard.No68;

import java.util.List;

public class Test {
    static String[] words = new String[]{"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"};
    static int maxWidth = 16;

    public static void main(String[] args) {
        No68 no68=new No68();
        List<String> stringList = no68.fullJustify(words, maxWidth);
        System.out.println("[");
        for (String s : stringList) {
            System.out.println("  "+"\""+s+"\","+s.length());
        }
        System.out.println("]");
    }

}
