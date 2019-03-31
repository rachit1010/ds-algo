package com.intuit.playground.trees;


public class BST {

    Node rootNode;

    public void insert1(int val) {
        insertNode(rootNode, val);
    }

    public Node insertNode(Node node, int val) {
        if (this.rootNode == null) {
            this.rootNode = new Node(val, null, null);
        } else if (node == null) {
            System.out.println("Inserting: " + val);
            return new Node(val, null, null);
        } else if (val < node.value)
            node.leftChild = insertNode(node.leftChild, val);
        else
            node.rightChild = insertNode(node.rightChild, val);
        return node;

    }

    public void deleteNode() {
        /*
        Handle cases when node to be deleted:
           1. no child
           2. single child
           3. both children
         */
    }

    public void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    public void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);
    }

    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
    }

    int findMinimum(Node root) {
        if (root == null)
            return 0;
        int lmin = root.leftChild == null ? root.value : findMinimum(root.leftChild);
        int rmin = root.rightChild == null ? root.value : findMinimum(root.rightChild);
        return Math.min(lmin, rmin);
    }


    boolean isBST(Node root, int prev) {
        // base case: empty tree is a BST
        if (root == null)
            return true;

        // check if left subtree is BST or not
        boolean left = isBST(root.leftChild, prev);

        // value of current node should be more than that of previous node
        if (root.value <= prev)
            return false;

        // update previous node and check if right subtree is BST or not
        prev = root.value;
        return left && isBST(root.rightChild, prev);
    }

    static int prev=Integer.MIN_VALUE;
    int IsBST2(Node root){
        if(root==null)
            return 1;
        if(IsBST2(root.leftChild)==0)
            return 0;
        if(root.value<prev)
            return 0;
        prev=root.value;
        return IsBST2(root.rightChild);
    }

    public static void main(String[] args) {
//        BST bst = new BST();
//        bst.insert1(10);
//        bst.insert1(6);
//        bst.insert1(5);
//        bst.insert1(8);
//        bst.insert1(15);
//
//
//        System.out.println("In order traversal is:");
//        bst.inOrder(bst.rootNode);
//        System.out.println("Min in tree is:" + bst.findMinimum(bst.rootNode));
//        bst.isBST(bst.rootNode,Integer.MIN_VALUE);
//        int a1=90;
        Integer a2=new Integer(90);
        Integer a1=new Integer(90);
        System.out.println(a1==a2);


    }
}
