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

    /**
     * PostOrder Traversal of a Tree
     * @param bstNode
     */

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

    /**
     * Find Minimum in Tree Using Iterative Approach
     * @return
     */
    public  int findMinIterative(BSTNode bstNode){
        if(isEmpty(bstNode)){
            return -1;}
        else{
            while(bstNode.getLeft()!=null){
                bstNode=bstNode.getLeft();
            }
            return bstNode.getData();
        }
    }


    /**
     * Find Minimum in Tree Using Recursive Approach
     * @return
     */
    public  int findMinRecursive(BSTNode bstNode) {
    if(isEmpty(bstNode)){
        return -1;
    }
    else if(bstNode.getLeft()==null){
        return bstNode.getData();
    }
    return  findMinRecursive(bstNode.getLeft());
    }
    /**
     * Find Maximum in Tree Using Iterative Approach
     * @return
     */

    public  int findMaxIterative(BSTNode bstNode){
        if(isEmpty(bstNode)){
            return -1;}
        else{
            while(bstNode.getRight()!=null){
                bstNode=bstNode.getRight();
            }
            return bstNode.getData();
        }
    }

    /**
     * Find Maximum in Tree Using Recursive Approach
     * @return
     */

    public  int findMaxRecursive(BSTNode bstNode){
        if(isEmpty(bstNode)){
            return -1;}
        else if(bstNode.getRight()==null) {

               return bstNode.getData();
            }
            return findMaxRecursive(bstNode.getRight());
        }

    /**
     * InOrder Traversal of a Tree
     * @param bstNode
     */
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

    public int heightOfTree(BSTNode bstNode){
        int leftHeight,rightHeight;
        if(isEmpty(bstNode)){
            return -1;
        }
        else{
            leftHeight = heightOfTree(bstNode.getLeft());
            rightHeight = heightOfTree(bstNode.getRight());
            return Math.max(leftHeight,rightHeight)+1;

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
        System.out.println();
        System.out.println(" Minimum in BST is: "+binarySearchTree.findMinIterative(bstNode));
        System.out.println();
        System.out.println(" Minimum in BST using Recursion is: "+binarySearchTree.findMinRecursive(bstNode));
        System.out.println();
        System.out.println(" Maximum in BST is: "+binarySearchTree.findMaxIterative(bstNode));
        System.out.println();
        System.out.println(" Maximum in BST using Recursion is: "+binarySearchTree.findMaxRecursive(bstNode));
        System.out.println();
        System.out.println(" Height of Tree is: "+binarySearchTree.heightOfTree(bstNode));






    }
}
