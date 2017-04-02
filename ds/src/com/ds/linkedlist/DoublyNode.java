package com.ds.linkedlist;

/**
 * Created by gaggi on 4/1/17.
 */
public class DoublyNode {

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    private DoublyNode next;

    public DoublyNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode prev) {
        this.prev = prev;
    }

    private DoublyNode prev;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;

    public DoublyNode(){
        this.next=null;
        this.prev=null;
        this.data=0;

    }
    public DoublyNode(int data,DoublyNode next, DoublyNode prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

}

