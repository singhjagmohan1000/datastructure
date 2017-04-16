package com.ds.linkedlist;

/**
 * Created by gaggi on 4/15/17.
 */
public class ReverseLinkedFifty {

    public Node reverseLinkedListAlt(Node head){

        Node slow=head,fast=head;
//        while(fast.getNext()!=null && fast.getNext().getNext()!=null){
//            fast=fast.getNext().getNext();
//            slow=slow.getNext();
//
//        }
//        while(middle.getNext()!=slow){
//            middle=middle.getNext();
//        }
        Node middleNode = findMiddle(head);

        Node second= middleNode.getNext();
        middleNode.setNext(null);



        Node secondList = reverseLinkedList(second);



        return mergeAlternate(head,secondList);
    }
    public Node mergeAlternate(Node node1,Node node2){
        Node start=node1;
        Node temp1=node1.getNext();
        Node temp2= node2.getNext();
        while(node1!=null){
            node1.setNext(node2);
            if(temp1==null)
                break;
            node2.setNext(temp1);

            node1=temp1;
            node2=temp2;

            temp1=temp1.getNext();
            if(temp2==null)
                break;
            temp2=temp2.getNext();
        }



        return start;
    }
    public Node findMiddle(Node head){

        Node slow=head,fast=head;
        while(fast.getNext()!=null && fast.getNext().getNext()!=null){
            fast=fast.getNext().getNext();
            slow=slow.getNext();

        }



        return slow;
    }
    public Node reverseLinkedList(Node head){

       Node prev=null,temp=null;
       while(head!=null){
           temp=head.getNext();
           head.setNext(prev);
           prev=head;
           head=temp;
       }
       return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedFifty reverseLinkedFifty = new ReverseLinkedFifty();
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


        head=reverseLinkedFifty.reverseLinkedListAlt(head);
        linkedList.traverseRecursive(head);
    }
}
