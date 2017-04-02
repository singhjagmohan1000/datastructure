package com.ds.linkedlist;

/**
 * Created by gaggi on 4/1/17.
 */
public class Stack {
    int top = -1;
    int A[]=new int[50];


    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    public int getTop(){
        return top;
    }

    public void push(int data){
        top = top+1;
        A[top]=data;

    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            System.out.print(" " + A[top]);
            top = top - 1;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        System.out.println(stack.isEmpty());
        System.out.println(stack.getTop());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);stack.push(6);stack.push(7);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
        System.out.println(stack.getTop());




    }

}
