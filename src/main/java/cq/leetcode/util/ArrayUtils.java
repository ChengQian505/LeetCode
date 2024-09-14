package cq.leetcode.util;

import java.util.Arrays;

/**
 * @author qian.cheng
 */
public class ArrayUtils {

    public static String toString(int[][] a) {
        if (a == null) {
            return "null";
        }

        int iMax = a.length - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(Arrays.toString(a[i]));
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(", ");
        }
    }

    public static int[][] getIntArgs(String argString) {
        argString = argString.replace("[[", "").replace("]]", "");
        String[] split = argString.split("],\\[");
        int[][] intArgs = new int[split.length][split[0].split(",").length];
        for (int i = split.length - 1; i >= 0; i--) {
            String[] split1 = split[i].split(",");
            int[] intArgs1 = new int[intArgs[0].length];
            for (int i1 = intArgs1.length - 1; i1 >= 0; i1--) {
                intArgs1[i1] = Integer.parseInt(split1[i1]);
            }
            intArgs[i] = intArgs1;
        }
        return intArgs;
    }

}
