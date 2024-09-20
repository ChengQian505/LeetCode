package cq.leetcode.answer;

import cq.leetcode.util.ListNode;


/**
 * @author qian.cheng
 * 2.两数相加
 */
public class No2 {

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(
                        ListNode.getListNode(new Integer[]{2, 4, 3}),
                        ListNode.getListNode(new Integer[]{5, 6, 4})
                ));
        System.out.println(addTwoNumbers(
                        ListNode.getListNode(new Integer[]{5}),
                        ListNode.getListNode(new Integer[]{5})
                ));
        System.out.println(addTwoNumbers(
                        ListNode.getListNode(new Integer[]{1,8}),
                        ListNode.getListNode(new Integer[]{0})
                ));
    }

    private static boolean needAdd=false;

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        while (l1 != null || l2 != null) {
            int num = 0;
            if (l1 != null) {
                num += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num += l2.val;
                l2 = l2.next;
            }
            if (needAdd){
                num++;
            }
            ListNode listNode1;
            if (num > 9) {
                listNode1 = new ListNode(num % 10);
                if (l1==null&&l2==null){
                    listNode1.next=new ListNode(1);
                    needAdd=false;
                }else{
                    needAdd=true;
                }
            } else {
                listNode1 = new ListNode(num);
                needAdd=false;
            }
            if (listNode!=null){
                ListNode listNode2=listNode;
                while (listNode2.next!=null){
                    listNode2=listNode2.next;
                }
                listNode2.next = listNode1;
            }else{
                listNode = listNode1;
            }
        }
        return listNode;
    }

}
