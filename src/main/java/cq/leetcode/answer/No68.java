package cq.leetcode.answer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 67.文本左右对齐
 */
public class No68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int index = 0;
        List<String> stringList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        while (index < words.length) {
            String indexString = words[index];
            if (stringBuilder.length() + indexString.length() > maxWidth) {
                int spaceSum = maxWidth - stringBuilder.length() + tempList.size();
                makeString(spaceSum, tempList, stringList);
                tempList.clear();
                stringBuilder = new StringBuilder();
            } else {
                tempList.add(indexString);
                stringBuilder.append(indexString);
                if (index != words.length - 1) {
                    stringBuilder.append(" ");
                }
                index++;
            }
        }
        if (tempList.size() != 0) {
            int spaceNumber = maxWidth - stringBuilder.length();
            for (int i = 0; i < spaceNumber; i++) {
                stringBuilder.append(" ");
            }
            stringList.add(stringBuilder.toString());
        }
        return stringList;
    }

    public void makeString(int spaceSum, List<String> tempList, List<String> stringList) {
        int averageNumber;
        int remainder;
        if (tempList.size() == 1) {
            averageNumber = spaceSum;
            remainder = 0;
        } else {
            averageNumber = spaceSum / (tempList.size() - 1);
            remainder = spaceSum % (tempList.size() - 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tempList.size(); i++) {
            stringBuilder.append(tempList.get(i));
            if (i != tempList.size() - 1 || tempList.size() == 1) {
                for (int j = 1; j < averageNumber + 1; j++) {
                    stringBuilder.append(" ");
                }
                if (i < remainder) {
                    stringBuilder.append(" ");
                }
            }
        }
        stringList.add(stringBuilder.toString());
    }

}
