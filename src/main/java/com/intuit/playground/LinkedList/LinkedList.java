package com.intuit.playground.LinkedList;

import com.intuit.playground.LinkedList.Node;

import java.sql.SQLOutput;

public class LinkedList {
    Node head;

     void addAtBeg(int data) {
        if (head == null) {
            head = new Node(data, null);
            return;
        } else {
            Node newNode = new Node(data, head);
            head = newNode;
        }
    }

     void printList(){
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

     void addatEnd(int data) {
        if(head==null){
             head = new Node(data, null);
            return;
        } else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(data,null);
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtBeg(30);
        ll.addAtBeg(20);
        ll.addAtBeg(10);
        ll.printList();
        ll.addatEnd(40);
        ll.addatEnd(50);
        ll.printList();

        

    }
}
