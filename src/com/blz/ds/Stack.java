package com.blz.ds;

//Stack Implementation using LL



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
