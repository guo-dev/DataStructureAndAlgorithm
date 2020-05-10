package com.test.linklist;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:44
 */
public class MyLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
            prev = null;
            next = null;
        }
        public ListNode() {
            val = 0;
            prev = null;
            next = null;
        }
    }

    int len = 0;
    ListNode head, tail;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new ListNode();
        tail = new ListNode();

        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= len)
            return -1;
        ListNode pre;
        if (index < len - index) {
            pre = head;
            for(int i = 0; i < index + 1; ++i)
                pre = pre.next;
            return pre.val;
        } else {
            pre = tail;
            for(int i = 0; i < len - index; ++i)
                pre = pre.prev;
            return pre.val;
        }
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        addAtIndex(len, val);
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index < 0)
            index = 0;
        else if (index > len)
            return;
        ListNode pre;
        if (index < len - index) {
            pre = head;
            for(int i = 0; i < index; ++i)
                pre = pre.next;
            ListNode temp = new ListNode(val);
            temp.prev = pre;
            temp.next = pre.next;
            pre.next.prev = temp;
            pre.next = temp;
        } else {
            pre = tail;
            for (int i = 0; i < len - index; ++i)
                pre = pre.prev;
            ListNode temp = new ListNode(val);
            temp.next = pre;
            temp.prev = pre.prev;
            pre.prev.next = temp;
            pre.prev = temp;
        }
        len++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= len)
            return;
        ListNode pre;
        if (index < len - index) {
            pre = head;
            for (int i = 0; i < index; ++i)
                pre = pre.next;
            pre.next.next.prev = pre;
            pre.next = pre.next.next;
        } else {
            pre = tail;
            for (int i = 0; i < len - index - 1; ++i)
                pre = pre.prev;
            pre.prev.prev.next = pre;
            pre.prev = pre.prev.prev;
        }
        len--;
    }
}
