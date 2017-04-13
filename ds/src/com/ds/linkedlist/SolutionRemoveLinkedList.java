package com.ds.linkedlist;

/**
 * Created by gaggi on 4/7/17.
 */


 //Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class SolutionRemoveLinkedList {
    public ListNode removeElements(ListNode head, int val) {

        if(head.val == val){

        }

        return head;

    }

    public static void main(String[] args) {
        SolutionRemoveLinkedList solutionRemoveLinkedList = new SolutionRemoveLinkedList();
        ListNode listNode,temp;
        ListNode head=null;
        int list[] = {1,2,3,4,5,6};
        for(int i=0;i<list.length;i++){
                listNode = new ListNode(list[i]);
                listNode.next=null;
                if(head==null)
                    head=listNode;
                else
                {   temp=head;
                while(temp.next!=null)
                    temp=temp.next;



                    temp.next=listNode;
                   // head=temp;

                }

        }
        while (head!=null)
        { System.out.print(head.val);
        head=head.next;}
        head=solutionRemoveLinkedList.removeElements(head,6);
        while (head!=null)
        { System.out.print(head.val);
            head=head.next;}

    }
}

