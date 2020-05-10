package com.test.linklist;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:43
 */
public class reverseList {

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null){
            tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
