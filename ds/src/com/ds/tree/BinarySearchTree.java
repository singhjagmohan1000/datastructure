package com.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by gaggi on 4/3/17.
 */
public class BinarySearchTree{
    int count=0;

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
    public  BSTNode findMin(BSTNode bstNode) {
        if(isEmpty(bstNode)){
            return null;
        }
        else if(bstNode.getLeft()==null){
            return bstNode;
        }
        return  findMin(bstNode.getLeft());
    }

    /**
     * Search Node for given data
     * @param bstNode
     * @param data
     * @return
     */
    public BSTNode searchNode(BSTNode bstNode,int data){

        if(bstNode==null){
            System.out.println("s");
            return bstNode;
        }
        if(data<bstNode.getData()){
           return searchNode(bstNode.getLeft(),data);
        }
        else if(data>bstNode.getData())
            return searchNode(bstNode.getRight(),data);
        else
            if(data==bstNode.getData())
                return bstNode;
        return bstNode;
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

    /**
     * Height of Tree
     * @param bstNode
     * @return
     */



    public int heightOfTree(BSTNode bstNode){
        int leftHeight,rightHeight;
        if(isEmpty(bstNode)){
            return -1;
        }
        else{
            leftHeight = heightOfTree(bstNode.getLeft());
            System.out.print("  "+count++);
            rightHeight = heightOfTree(bstNode.getRight());
            return Math.max(leftHeight,rightHeight)+1;

        }
    }

    /**
     * Level Order Traversl
     * Hint: Use Queue
     * @param bstNode
     */
    public void levelOrderTraversal(BSTNode bstNode){
    if(isEmpty(bstNode)){
        System.out.println("Tree is Empty");
    }
    else{
        Queue<BSTNode> queue = new LinkedList<BSTNode>();
        queue.add(bstNode);
        while(!queue.isEmpty()){
            BSTNode node = queue.peek();
            System.out.print(" "+node.getData());
            if(node.getLeft()!=null)
                queue.add(node.getLeft());
            if (node.getRight()!=null)
                queue.add(node.getRight());
            queue.remove();

        }



    }


    }

    public boolean isBSTreeLesser(BSTNode bstNode,int data){
        if(isEmpty(bstNode)){
            return true;

        }
        if(bstNode.getData()<data && isBSTreeLesser(bstNode.getLeft(),data) && isBSTreeLesser(bstNode.getRight(),data))
            return true;
        else
            return false;

    }
    public boolean isBSTreeGreater(BSTNode bstNode,int data){
        if(isEmpty(bstNode)){
            return true;
        }
        if(bstNode.getData()>data&&isBSTreeGreater(bstNode.getRight(),data)&&isBSTreeGreater(bstNode.getLeft(),data))
            return true;
        else
            return false;
    }

    /**
     * We can check if maximum of left subtree is less than root node and minimum from rightSubtree is more than root
     * @param bstNode
     * @return
     */
  public boolean isBSTree(BSTNode bstNode){

      if(isEmpty(bstNode)){
          return true;
      }
      if(isBSTreeLesser(bstNode.getLeft(),bstNode.getData())&&isBSTreeGreater(bstNode.getRight(),bstNode.getData())&&isBSTree(bstNode.getLeft())&&isBSTree(bstNode.getRight()))
          return true;

      else

      return false;

  }

    /**
     * Recursive Method findLCANode will return the least common ancestor node
     * @param bstNode
     * @param node1
     * @param node2
     * @return
     */

  public BSTNode findLCANode(BSTNode bstNode,int node1,int node2){

      if(bstNode.getData()>Math.max(node1,node2))
          return findLCANode(bstNode.getLeft(),node1,node2);
      else if (bstNode.getData()<Math.min(node1,node2))
          return findLCANode(bstNode.getRight(),node1,node2);
      else
          return bstNode;

  }

  public int findPath(BSTNode bstNode,int node){

      if(bstNode.getData()==node){
          return 0;
      }
      else{
          if(bstNode.getData()<node)
              return findPath(bstNode.getRight(),node)+1;
          else
              return findPath(bstNode.getLeft(),node)+1;
      }

  }
    /**
     * Find distance between two nodes by first get the common node and then count the edges between common node to that node
     * @param bstNode
     * @return
     */

  public int distanceBetweenNodes(BSTNode bstNode,int node1,int node2){

      if(bstNode == null){
          System.out.println("Tree is Empty");
          return -2;
      }

      BSTNode temp;


      temp = findLCANode(bstNode,node1,node2);
      System.out.println(temp.getData());
      int x = findPath(temp,node1);
      int y = findPath(temp,node2);
      System.out.println(x+"       "+y);

      return x+y;
  }

    /**
     * Optimized sol for checking if BST is valid or not
     * @param bstNode
     * @return
     */
    public boolean isValidBST(BSTNode bstNode) {
    return isValidBST(bstNode, Long.MIN_VALUE, Long.MAX_VALUE);
}

    public boolean isValidBST(BSTNode bstNode, long minVal, long maxVal) {
        if (bstNode == null) return true;
        if (bstNode.getData() >= maxVal || bstNode.getData() <= minVal) return false;
        return isValidBST(bstNode.getLeft(), minVal, bstNode.getData()) && isValidBST(bstNode.getRight(), bstNode.getData(), maxVal);
    }

    /**
     * Find Succesor of Node in InOrder following two cases
     * CASE 1: Right Child then find min from right tree
     * CASE 2: IF No Right Child then immediate ancestor not visited
     * @param bstNode
     * @param data
     * @return
     */

    public BSTNode successorNode(BSTNode bstNode,int data){



        if(bstNode ==null ){
            return null;
        }
        else{BSTNode node= searchNode(bstNode,data);
            if(node!=null){
            if(node.getRight()!=null){
                return findMin(node.getRight());
            }
            else{
                BSTNode successor = null ;
                BSTNode ancestor = bstNode;
                while(ancestor!=node){
                    if(node.getData() < ancestor.getData())
                    {successor = ancestor;
                    ancestor = ancestor.getLeft();}
                    else
                        ancestor=ancestor.getRight();


                }
                return successor;
            }
        }

            else return null;
        }
    }

    /**
     * Delete a node in bst there are 3 cases,
     * Case 1 No Child
     * Case 2 Single Child
     *      make left or right node as target node which is not null
     * Case 2 Two Children
     *          Find min from right or max from left and make that the target node
     * @param bstNode
     * @param data
     * @return
     */

    public BSTNode deleteNode(BSTNode bstNode,int data){

        if(bstNode == null)
            return null;
        else if(data < bstNode.getData())
                bstNode.setLeft(deleteNode(bstNode.getLeft(),data));
        else if(data > bstNode.getData())
            bstNode.setRight(deleteNode(bstNode.getRight(),data));
        else{
            //NO Child
            if(bstNode.getLeft()==null && bstNode.getRight()==null){
                bstNode=null;
                return bstNode;
            }
            else if(bstNode.getRight()==null){
                bstNode = bstNode.getLeft();
                return bstNode;
            }
            else if(bstNode.getLeft()==null){
                bstNode = bstNode.getRight();
                return bstNode;
            }
            else{

                BSTNode node = findMin(bstNode.getRight());

                bstNode.setData(node.getData());
                bstNode.setRight(deleteNode(bstNode.getRight(),node.getData()));



            }

        }
        return  bstNode;
    }
    /**
     * Main Funcitons
     * @param args
     */
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        BSTNode bstNode=null;
        bstNode = binarySearchTree.insertNode(bstNode,5);
        bstNode = binarySearchTree.insertNode(bstNode,3);
        bstNode = binarySearchTree.insertNode(bstNode,8);
        bstNode = binarySearchTree.insertNode(bstNode,2);
        bstNode = binarySearchTree.insertNode(bstNode,4);
        bstNode = binarySearchTree.insertNode(bstNode,7);
        bstNode = binarySearchTree.insertNode(bstNode,9);

        System.out.println("hi"+ binarySearchTree.distanceBetweenNodes(bstNode,4,8));

//        bstNode = binarySearchTree.insertNode(bstNode,15);
//        bstNode = binarySearchTree.insertNode(bstNode,21);
//        bstNode = binarySearchTree.insertNode(bstNode,12);
//        bstNode = binarySearchTree.insertNode(bstNode,17);
//        bstNode = binarySearchTree.insertNode(bstNode,13);
//        bstNode = binarySearchTree.insertNode(bstNode,14);
//        bstNode = binarySearchTree.insertNode(bstNode,16);
//        bstNode = binarySearchTree.insertNode(bstNode,5);
//        bstNode = binarySearchTree.insertNode(bstNode,8);
//        bstNode = binarySearchTree.insertNode(bstNode,10);
//        bstNode = binarySearchTree.insertNode(bstNode,6);
//        bstNode = binarySearchTree.insertNode(bstNode,-5);
//        bstNode = binarySearchTree.insertNode(bstNode,20);
//        bstNode = binarySearchTree.insertNode(bstNode,18);
//        bstNode = binarySearchTree.insertNode(bstNode,19);
//
//        bstNode = binarySearchTree.insertNode(bstNode,1);
//        bstNode = binarySearchTree.insertNode(bstNode,2);
//        System.out.println(" Pre Order Traversal");
//        binarySearchTree.preOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println(" Post Order Traversal");
//        binarySearchTree.postOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println(" In Order Traversal");
//        binarySearchTree.inOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println(" Minimum in BST is: "+binarySearchTree.findMinIterative(bstNode));
//        System.out.println();
//        System.out.println(" Minimum in BST using Recursion is: "+binarySearchTree.findMinRecursive(bstNode));
//        System.out.println();
//        System.out.println(" Maximum in BST is: "+binarySearchTree.findMaxIterative(bstNode));
//        System.out.println();
//        System.out.println(" Maximum in BST using Recursion is: "+binarySearchTree.findMaxRecursive(bstNode));
//        System.out.println();
//        System.out.println(" Height of Tree is: "+binarySearchTree.heightOfTree(bstNode));
//        System.out.println();
//        System.out.print(" Level Order Traversal  of Tree is: ");
//        binarySearchTree.levelOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println(" Is Binary Tree: "+binarySearchTree.isBSTree(bstNode));
//        System.out.println(" Distance between two nodes: ");
//        System.out.println(binarySearchTree.distanceBetweenNodes(bstNode,18,10));
//        bstNode = binarySearchTree.deleteNode(bstNode,17);
//        System.out.println(" Pre Order Traversal");
//        binarySearchTree.preOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println(" In Order Traversal");
//        binarySearchTree.inOrderTraversal(bstNode);
//        System.out.println();
//        System.out.println("Successor of current node is: "+binarySearchTree.successorNode(bstNode,10).getData());
//
//
//
//



    }
}
