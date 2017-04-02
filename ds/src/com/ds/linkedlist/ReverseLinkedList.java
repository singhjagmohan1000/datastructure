package com.ds.linkedlist;

/**
 * Created by gaggi on 4/1/17.
 */
public class ReverseLinkedList {
  public  Node head;

    public Node reverseList(Node node){
        Node prev=null;
        Node temp=null;
        while(node!=null){
            temp = node.getNext();
           node.setNext(prev);
            prev=node;
            node = temp;
        }
        return prev;
    }
   public void reverseListRecursion(Node node){
        if(node.getNext() == null){
            head = node;
            return;
        }
       reverseListRecursion(node.getNext());
        Node temp = node.getNext();
        temp.setNext(node);
        node.setNext(null);

   }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addLinkAtStart(43);
        linkedList.addLinkAtStart(12);
        linkedList.addLinkAtStart(34);
        linkedList.addLinkAtStart(90);
        linkedList.addLinkAtStart(67);
        linkedList.addLinkAtStart(123);
        linkedList.addLinkAtStart(9);
        Node head = linkedList.getHead();
//        linkedList.traverseList(head);
        linkedList.traverseRecursive(head);


        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node rev = reverseLinkedList.reverseList(head);
        System.out.println("********Linked List after Reverse*****");
        linkedList.traverseRecursive(rev);
        System.out.println("********Linked List after another Reverse*****");
        //linkedList.traverseReverseRecursive(rev);
        reverseLinkedList.reverseListRecursion(head);


    }
}
