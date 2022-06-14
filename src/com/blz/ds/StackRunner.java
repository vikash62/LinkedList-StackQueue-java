package com.blz.ds;
//Stack Runner to test Stack


public class Stack {

LinkedList list = new LinkedList();

 public void push(Object data)
 {
     list.addLast(data);
 }

 public void pop()
 {
     list.deleteLast();
 }

 public void display()
 {
     list.display();
 }


}