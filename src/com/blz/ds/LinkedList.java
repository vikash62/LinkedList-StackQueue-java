package com.blz.ds;

import com.blz.ds.LinkedList.Node;

public class LinkedList {

    Node head; // null

    class Node {
        Object data; // int , double, string ...
        Node next;

        public Node(Object data) {
            this.data = data;
        }

    }
    public void addFirst(Object data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;

        }
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);

        if (head == null)
            head = newNode; // head=>[1 |null ] // list is notempty
        else {
            Node temp = head; // tempararory pointer

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;

        }

    }
    public void display() {
        /*
         * []==> No elements to display.. head==> temp=>[10 | null] [10 | ref20]
         * ==> [20 | ref 30] ==> [30 | null]
         */

        if (head == null)
            System.out.println("No elements to display..");
        else if (head.next == null)
            System.out.println(head.data);
        else {
            Node temp = head;
            // 10==>20==>30==>40=> 50=>==>null
            while (temp != null) {
                if (temp.next != null)
                    System.out.print(temp.data + "==>");
                else
                    System.out.print(temp.data + "\n");
                temp = temp.next;
            }

        }

    }     
}
