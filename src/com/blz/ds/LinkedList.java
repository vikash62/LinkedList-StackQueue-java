package com.blz.ds;



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
    

    public void insertAtSpecificIndex(int userIndex, Object data) {

        // User trying to insert @ first position
        if (userIndex == 0)
            addFirst(data);

        // // User trying to insert @ last position
        else if (userIndex == size())
            addLast(data);

        // User trying to insert @ invalid position
        else if (userIndex < 0 || userIndex >= size())
            System.out.println("Invalid index");
        // User trying to insert @ specific index
        else {
            // Creating New Node
            Node newNode = new Node(data);

            // To track traversing
            int index = 0;

            // Pointers to track left & right side elements
            Node left = head;
            Node right = left.next;

            // Traverse or Move till last element before user entered index
            while (index < userIndex - 1) {
                left = left.next;
                right = right.next;
                index++;
            }

            // Connnecting new Node with right side elements
            newNode.next = right;
            // Connnecting left side elements with new Node
            left.next = newNode;

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
    public int size() {
        int count = 0; // No data 1 element

        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;

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

    public void deleteFirst() {
        if (head == null)
            System.out.println("No elements to delete...");
        else if (head.next == null)
            head = null;
        else {

            Node temp = head.next;
            head = temp;

        }
    }
    public void deleteLast() {

        if (head == null)
            System.out.println("No elements to delete..");
        else if (head.next == null)
            head = null;
        else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }

        /*
         * list may be empty head=> [ 1 | null ] Not empty Only one element
         */

    }
    public void search(Object searchData)
    {
            if(head.data == searchData)
                System.out.println(searchData + " is Found");
            else
            {
                   Node temp=head;
                   
                   boolean isFound=false;
                   
                   while(temp!=null)
                   {
                       if(temp.data == searchData)
                       {
                           isFound = true;
                              break;
                       }
                       
                       temp=temp.next;
                   }
                   
                   if(isFound == true)
                       System.out.println(searchData+ " is Found");
                   else
                      System.out.println(searchData+" is not found..");
            }
           
    }
}
