package com.blz.ds;

public class LinkedListRunner {

    public static void main(String[] args) {

        // 10 ==>20==>30==>40==>50
        LinkedList linkedList = new LinkedList();      

//        linkedList.addLast(56);
//        linkedList.addLast(30);
//        linkedList.addLast(70);
//        linkedList.display();
        
        linkedList.addFirst(70);
//        linkedList.addFirst(30);
        linkedList.addFirst(56);
       
        linkedList.display();
        linkedList.insertAtSpecificIndex(1, 30);
        linkedList.display();
       
        linkedList.deleteFirst();
        linkedList.display();
       
        
      linkedList.addLast(56);
      linkedList.addLast(30);
      linkedList.addLast(70);
      linkedList.display();
      
        linkedList.deleteLast();
        linkedList.display();
    
       

    }

}