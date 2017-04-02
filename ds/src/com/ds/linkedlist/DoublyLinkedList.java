package com.ds.linkedlist;

/**
 * Created by gaggi on 4/1/17.
 */
public class DoublyLinkedList {
    DoublyNode head;

    public DoublyLinkedList(){
        this.head =null;
    }
    public boolean isEmpty(){

        if(head == null)
            return true;
        else
            return false;

    }


    public  void insertAtStart(int data){

        if(isEmpty()){
            DoublyNode doublyNode = new DoublyNode(data,null,null);
            head = doublyNode;
        }
        DoublyNode node = new DoublyNode(data,null,null);
        node.setNext(head);
        head.setPrev(node);
       head=node;



    }

    public void traverse(){

        if(isEmpty()){

            System.out.println(" List is empty :(");

        }
        else{
            DoublyNode node = head;
            while(true){

                System.out.print(" " + node.getData());
                node=node.getNext();
                if(node==null)
                    break;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtStart(5);
        doublyLinkedList.insertAtStart(7);
        doublyLinkedList.insertAtStart(4);
        doublyLinkedList.insertAtStart(8);
        doublyLinkedList.insertAtStart(6);
        doublyLinkedList.traverse();


    }

}
