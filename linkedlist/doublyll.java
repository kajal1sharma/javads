class Nodes{
    //data
    int data;
    Nodes next;
    Nodes prev;
    
    Nodes(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
  
    
    }

class doublyll{

    static void print(Nodes head){
        while(head!=null){
            System.out.print(head.data+"  ");
            head=head.next;
        }
    }
    static Nodes deletefromend(Nodes head){
        if(head==null ||head.next==null){
            return null;
        }
        else{
            Nodes curr=head;

            while(curr.next!=null){
                curr=curr.next;
            }

            curr.prev.next=null;
            curr.prev=null;
        }

        return head;
    }
    public static void main(String[] args) {
        Nodes head=new Nodes(12);
        head.next=new Nodes(14);
        head.next.prev=head;
        Nodes temp=new Nodes(16);
        temp.prev=head.next;
        head.next.next=temp;
        head=deletefromend(head);
        print(head);

        //insertatstart
        //insertatend
        //insertatmiddle(,k)
        //delete 3 cases
    }
}