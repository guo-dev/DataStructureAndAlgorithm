package com.test.linklist;

import java.util.HashMap;

/**
 * @author guoqinglin
 * @create 2020-05-06-18:47
 */
public class copyRandomList {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    HashMap<Node,Node> visitHash = new HashMap<Node,Node>();
    public Node copyRandomList(Node head) {
        if(head ==null) {return null;}
        if(this.visitHash.containsKey(head)){
            return this.visitHash.get(head);
        }
        Node node = new Node(head.val);

        this.visitHash.put(head,node);
        node.next = this.copyRandomList(head.next);
        node.random = this.copyRandomList(head.random);
        return node;
    }
}
