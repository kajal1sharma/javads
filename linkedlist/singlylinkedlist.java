package linkedlist;
class Node{
//data
int data;
String name;

//address
//node type object =addresss to be stored hence next type is node
Node next;

Node(int data,String name){
    this.data=data;
    this.name=name;
    this.next=null;
}

}
public class singlylinkedlist {
public static void main(String[] args) {
    Node head;
    head=new Node(20,"tina");
    head.next=new Node(30,"priya");
    System.out.println(head.data);
    System.out.println(head.next.data);
}    
}
