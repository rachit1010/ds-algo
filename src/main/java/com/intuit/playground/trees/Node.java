package com.intuit.playground.trees;


public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int val, Node lc, Node rc) {
        this.value = val;
        this.leftChild = lc;
        this.rightChild = rc;
    }
}