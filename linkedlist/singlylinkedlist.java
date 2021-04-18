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

static void doubledata(Node head){
    if(head==null){
        return;
    }
    else{
        head.data=2*head.data;
        doubledata(head.next);
    }
}
//data of node swapped
    static void swap(Node head){

        while(head!=null && head.next!=null ){
            int temp=head.data;
            head.data=head.next.data;
            head.next.data=temp;

            head=head.next.next;
        }
    }

//nodes swapped

static Node swapnode(Node head){
    Node root=head;
    if(head.next!=null){
        root=head.next;
    }
    Node prev=null;
    while(head!=null && head.next!=null ){
        Node temp=head.next;
        head.next=temp.next;
        temp.next=head;
        if(prev==null){
            prev=head;
        }
        else{
            prev.next=temp;
            prev=head;
        }
        head=head.next;
    }
    return root;
}
static Node insertatstart(int data,Node head){

    Node temp=new Node(data);
    if(head==null){
        head=temp;
    }
    else{
        temp.next=head;
        head=temp;
    }
return head;
}
public static void main(String[] args) {
    
    Node head=null;
    head=insertll(20,head);
    insertll(30,head);
    insertll(40,head);
    insertll(50,head);
    insertll(60,head);
    insertll(70,head);
    head=insertatstart(80,head);
    print(head);
//   doubledata(head);
   // head=swapnode(head);
   // printrec(head);
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
