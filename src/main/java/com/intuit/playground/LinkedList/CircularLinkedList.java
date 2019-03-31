package com.intuit.playground.LinkedList;


public class CircularLinkedList {

    public Node head;

    CircularLinkedList() {

    }


    public Node insert(Node head, int k) {

        if (head == null) {
            head = new Node(k, null);
            head.next = head;
            return head;
        }

        Node temp = head;
        //Handling the case when only 1 node is there
        if (temp == temp.next) {
            Node newNode = new Node(k, temp.next);
            temp.next = newNode;
            return head;
        }

        //Handling the case when rythm is breaking
        if (temp.val >= temp.next.val) {
            if (k >= temp.val || k <= temp.next.val) {
                Node newNode = new Node(k, temp.next);
                temp.next = newNode;
                return head;
            }
        }

        if (k >= temp.val && k <= temp.next.val) {
            Node newNode = new Node(k, temp.next);
            temp.next = newNode;
        }
        // else if( (k>temp.val && k> temp.next.val) || (k<temp.val && k<ptr.next.val) ){
        else {
            temp = temp.next;
            boolean found = false;
            while (found == false) {
                if (k >= temp.val && k <= temp.next.val) {
                    found = true;
                    break;
                }
                temp = temp.next;
            }
            Node newNode = new Node(k, temp.next);
            temp.next = newNode;
        }
        return head;
    }


    public void insertNode(int data) {
        if (head == null) {
            head = new Node(data, null);
            head.next = head;
        } else {
            if (head == head.next) {
                Node newNode = new Node(data, head);
                head.next = newNode;
            } else {
                Node temp = head;
                while (temp.val < temp.next.val) {
                    temp = temp.next;
                }
                Node newNode = new Node(data, temp.next);
                temp.next = newNode;
            }
        }

    }

    public void printList() {
        System.out.print("Printing values:");
        Node temp = head;
        while (temp.val < temp.next.val) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val + " ");

    }


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertNode(3);
        cll.insertNode(3);
        cll.insertNode(3);
        cll.printList();
        cll.insert(cll.head.next, 3);
        cll.printList();
    }
}
