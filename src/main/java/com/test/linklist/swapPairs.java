package com.test.linklist;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:46
 */
public class swapPairs {



    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    public ListNode swapPairs(ListNode head) {
        if(head == null||head.next==null)
            return head;

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }
}
