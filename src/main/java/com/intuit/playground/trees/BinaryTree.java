package com.intuit.playground.trees;

public class BinaryTree {

    public static void main(String[] args) {
        Node newNode=new Node(10,new Node(6,new Node(12,null,null),new Node(8,null,null)),new Node(15,null,null));
        BST bst=new BST();
        System.out.println("In order traversal is:");
        bst.inOrder(newNode);
//        System.out.println("\nIsBST result:"+bst.isBST(newNode,Integer.MIN_VALUE));
        System.out.println("\nIsBST result:"+bst.IsBST2(newNode));

    }
}
