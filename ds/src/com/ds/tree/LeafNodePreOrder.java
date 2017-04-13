package com.ds.tree;

/**
 * Given a PreOrder Traversal Print LeafNodes without constructing tree
 * Created by gaggi on 4/4/17.
 */
public class LeafNodePreOrder {

    public void printLeafNode(int preOrderTree[]){

        /**
         * Initialize leaf with arra[0]
         */

        int leaf = preOrderTree[0];
        for(int i=1;i<preOrderTree.length;i++){
            if(leaf<preOrderTree[i])
                System.out.print(" "+leaf);
            leaf = preOrderTree[i];

        }
        System.out.print(" "+leaf);

    }

    public static void main(String[] args) {
        LeafNodePreOrder leafNode = new LeafNodePreOrder();
        int a[] = {12,7,6,8,9,16,13,12,14,18};
        leafNode.printLeafNode(a);
    }
}
