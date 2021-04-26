package com.employee.org.practice;

import javax.xml.soap.Node;

public class MyLinkedList {
    Node head;

   static class Node{
        int data;
        Node next;

        public Node(int d) {
            data=d;
            next=null;
        }
    }

    public static MyLinkedList insert(MyLinkedList list,int data){

        Node new_node= new Node(data);
        new_node.next=null;

        if(list.head==null){
            list.head=new_node;
        }
        else {
            Node last=list.head;
            while(last.next!=null){

                last =last.next;
            }

            last.next= new_node;
        }

return list;
    }

public static void printList(MyLinkedList list){
Node currNode=list.head;
    System.out.println("MylinkedList  :");
while (currNode!=null){

    System.out.println(currNode.data+"  ");
    currNode=currNode.next;

}


    }


    public static void main(String[] args) {

       MyLinkedList list = new MyLinkedList();
       list=list.insert(list,12);
        list=list.insert(list,2);
        list=list.insert(list,10);
        list=list.insert(list,0);
        list=list.insert(list,21);
        list=list.insert(list,28);

   printList(list);
   }
}
