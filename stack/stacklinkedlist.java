class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class Stck{
    Node head=null;//top

    int size=0;

    public void push(int data){
        Node temp=new Node(data);
        if(this.head==null){
            this.head=temp;
            this.size++;
        }
        else{
            temp.next=head;
            head=temp;
            this.size++;
        }
    }

    public void pop(){
        if(this.head==null){
            System.out.println("stack underflow");
            return ;
        }
        else{
            Node temp=this.head;
            head=head.next;
            temp.next=null;
            this.size--;
        }
    }

    public int getsize(){
        return this.size;
    }

    public int top(){
        if(this.head!=null){
            return this.head.data;
        }
        return Integer.MAX_VALUE;
    }

    public boolean isempty(){
        if(this.head==null){
            return true;
        }
        return false;
    }
}

public class stacklinkedlist {
public static void main(String[] args) {
    Stck st=new Stck();
    st.push(10);
    st.push(20);
    System.out.println(st.top());
}    
}
