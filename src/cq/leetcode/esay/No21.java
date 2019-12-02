package cq.leetcode.esay;

import cq.leetcode.util.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 21.合并两个有序链表
 * 2019-11-14 qian.cheng 当前方案应该有更优解
 */
public class No21 {
    public static void main(String[] args) {
        System.out.println(mergeTwoLists(ListNode.getListNode(new Integer[]{1,2,4}),ListNode.getListNode(new Integer[]{1,3,4})));
    }

    private static List<Integer> integerList=new ArrayList<>();

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            Integer[] integers=new Integer[integerList.size()];
            return ListNode.getListNode(integerList.toArray(integers));
        }else{
            if (l1==null){
                integerList.add(l2.val);
                return mergeTwoLists(null,l2.next);
            }else if (l2==null){
                integerList.add(l1.val);
                return mergeTwoLists(l1.next, null);
            }else{
                if (l1.val<=l2.val){
                    integerList.add(l1.val);
                    return mergeTwoLists(l1.next, l2);
                }else{
                    integerList.add(l2.val);
                    return mergeTwoLists(l1, l2.next);
                }
            }
        }
    }

}
