package linkedlist;
class Node{
//data
int data;
//String name;

//address
//node type object =addresss to be stored hence next type is node
Node next;

Node(int data){
    this.data=data;
    this.next=null;
}
// Node(int data,String name){
//     this.data=data;
//     this.name=name;
//     this.next=null;
// }

}
public class singlylinkedlist {

    public static Node insertll(int data,Node head){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return head;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=temp;
        }
        return head;
    }


    static void print(Node head){

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
System.out.println();
    }
//recursion 
static void printrec(Node head){

    if(head==null){
        return;
    }
    else{
        System.out.print(head.data+" ");
        printrec(head.next);
    }

}

    static void swap(Node head){

        while(head!=null && head.next!=null ){
            int temp=head.data;
            head.data=head.next.data;
            head.next.data=temp;

            head=head.next.next;
        }
    }
public static void main(String[] args) {
    
    Node head=null;
    head=insertll(20,head);
    insertll(30,head);
    insertll(40,head);
    insertll(50,head);
    insertll(60,head);
    insertll(70,head);
   // print(head);
    printrec(head);
    // swap(head);
    // print(head);
    // Node head;
    // head=new Node(20,"tina");
    // head.next=new Node(30,"priya");
    // head.next.next=new Node(40,"tia");
    // System.out.println(head.data);
    // System.out.println(head.next.data);


}    
}
