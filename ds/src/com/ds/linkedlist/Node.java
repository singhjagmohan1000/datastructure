package com.ds.linkedlist;

/**
 * Created by Gaggi on 2/26/17.
 */
public class Node {
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;
    public Node(){
        this.next=null;
        this.data=0;

    }
    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
