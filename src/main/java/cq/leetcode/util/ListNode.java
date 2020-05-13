package cq.leetcode.util;

public class ListNode {
    public int val;
    public ListNode next;   // 下一个链表对象
    public ListNode(int val) { this.val = val; }  //赋值链表的值

    @Override
    public String toString() {
        if (next==null){
            return val+"";
        }else{
            return val+","+next.toString();
        }
    }

    /**
     * 生成ListNode
     * @param args
     * @return
     */
    public static ListNode getListNode(Integer[] args){
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
}
