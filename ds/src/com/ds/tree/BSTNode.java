package com.ds.tree;

/**
 * Created by gaggi on 4/3/17.
 */
public class BSTNode {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    private BSTNode right;
    private BSTNode left;

    public BSTNode(){

        this.left=null;
        this.right= null;
        this.data=0;

    }
    public BSTNode(int data, BSTNode left,BSTNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
