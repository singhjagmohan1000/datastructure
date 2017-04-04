package com.ds.tree;

/**
 * Created by gaggi on 4/3/17.
 */
public class BinarySearchTree{

    public boolean isEmpty(BSTNode bstNode){
        if(bstNode == null)
            return true;
        else
            return false;

    }

    /**
     *
     * @param bstNode
     * @param data
     * @return
     * Method for Inserting a Node in Binary Tree.
     */

    public BSTNode insertNode(BSTNode bstNode, int data){

        if(isEmpty(bstNode)){
            bstNode = new BSTNode(data,null,null);

        }
        else if(bstNode.getData() < data){

            bstNode.setRight(insertNode(bstNode.getRight(),data));



        }
        else{

            bstNode.setLeft(insertNode(bstNode.getLeft(),data));

        }
        return bstNode;
    }

    /**
     *
     * @param bstNode
     * PreOrder Traversal of a Tree
     */

    public void preOrderTraversal(BSTNode bstNode){

        if(isEmpty(bstNode)){
            return;

        }
        else{
            System.out.print(" "+bstNode.getData());
            preOrderTraversal(bstNode.getLeft());
            preOrderTraversal(bstNode.getRight());
        }

    }

    public void postOrderTraversal(BSTNode bstNode){
        if(isEmpty(bstNode)){
            return;
        }
        else{
            postOrderTraversal(bstNode.getLeft());
            postOrderTraversal(bstNode.getRight());
            System.out.print(" "+bstNode.getData());
        }
    }

    public  int findMinIterative(){
        return -1;
    }
    public  int findMinRecursive(){
        return -1;
    }
    public  int findMaxIterative(){
        return -1;
    }
    public  int findMaxRecursive(){
        return -1;
    }
    public void inOrderTraversal(BSTNode bstNode){
        if(isEmpty(bstNode)){
            return;
        }
        else{
            inOrderTraversal(bstNode.getLeft());
            System.out.print(" "+bstNode.getData());
            inOrderTraversal(bstNode.getRight());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        BSTNode bstNode=null;
        bstNode = binarySearchTree.insertNode(bstNode,15);
        bstNode = binarySearchTree.insertNode(bstNode,21);
        bstNode = binarySearchTree.insertNode(bstNode,12);
        bstNode = binarySearchTree.insertNode(bstNode,17);
        bstNode = binarySearchTree.insertNode(bstNode,13);
        bstNode = binarySearchTree.insertNode(bstNode,14);
        bstNode = binarySearchTree.insertNode(bstNode,16);
        bstNode = binarySearchTree.insertNode(bstNode,5);
        bstNode = binarySearchTree.insertNode(bstNode,8);
        bstNode = binarySearchTree.insertNode(bstNode,10);
        bstNode = binarySearchTree.insertNode(bstNode,6);
        bstNode = binarySearchTree.insertNode(bstNode,-5);
        bstNode = binarySearchTree.insertNode(bstNode,19);
        bstNode = binarySearchTree.insertNode(bstNode,18);
        bstNode = binarySearchTree.insertNode(bstNode,1);
        bstNode = binarySearchTree.insertNode(bstNode,2);
        System.out.println(" Pre Order Traversal");
        binarySearchTree.preOrderTraversal(bstNode);
        System.out.println();
        System.out.println(" Post Order Traversal");
        binarySearchTree.postOrderTraversal(bstNode);
        System.out.println();
        System.out.println(" In Order Traversal");
        binarySearchTree.inOrderTraversal(bstNode);








    }
}
