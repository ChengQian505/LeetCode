package cq.leetcode.esay;

import cq.leetcode.util.ListNode;
import java.util.ArrayList;
import java.util.List;

/**
 * 21.合并两个有序链表
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Definition for singly-linked list.
 *  * public class ListNode {
 *  *     int val;
 *  *     ListNode next;
 *  *     ListNode(int x) { val = x; }
 *  * }
 * 2019-11-14 qian.cheng 当前方案应该有更优解
 */
public class No21 {
    public static void main(String[] args) {
        System.out.println(mergeTwoLists(getListNode(new Integer[]{1,2,4}),getListNode(new Integer[]{1,3,4})));
    }

    /**
     * 生成ListNode
     * @param args
     * @return
     */
    private static ListNode getListNode(Integer[] args){
        if (args.length==0){
            return null;
        }
        ListNode listNode1 = null;
        for (int i=args.length-1;i>=0;i--){
            if (listNode1==null){
                listNode1=new ListNode(args[i]);
            }else{
                ListNode listNode2=new ListNode(args[i]);
                listNode2.next=listNode1;
                listNode1=listNode2;
            }
        }
        return listNode1;
    }

    private static List<Integer> integerList=new ArrayList<>();

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            Integer[] integers=new Integer[integerList.size()];
            return getListNode(integerList.toArray(integers));
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
