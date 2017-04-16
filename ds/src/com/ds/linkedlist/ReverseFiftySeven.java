package com.ds.linkedlist;

/**
 * Created by gaggi on 4/15/17.
 */
public class ReverseFiftySeven {

    public Node rotateRight(Node head,int n){

        Node nodeStart=head,nodeEnd=head;
        while(n>0){
            nodeEnd=nodeEnd.getNext();
            n--;
        }
        while(nodeEnd.getNext()!=null){
            nodeStart=nodeStart.getNext();
            nodeEnd=nodeEnd.getNext();

        }

        nodeEnd.setNext(head);
        head=nodeStart.getNext();
        nodeStart.setNext(null);

        return head;
    }

    public static void main(String[] args) {
        ReverseFiftySeven reverseFiftySeven= new ReverseFiftySeven();
        LinkedList linkedList = new LinkedList();
        linkedList.addLinkAtStart(8);
        linkedList.addLinkAtStart(7);
        linkedList.addLinkAtStart(6);
        linkedList.addLinkAtStart(5);
        linkedList.addLinkAtStart(4);
        linkedList.addLinkAtStart(3);
        linkedList.addLinkAtStart(2);
        linkedList.addLinkAtStart(1);
        Node head = linkedList.getHead();


        head=reverseFiftySeven.rotateRight(head,3);
        linkedList.traverseRecursive(head);
    }
}
