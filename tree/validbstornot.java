class Node{
    int data;
    Node left;
    Node right;


    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
} 
public class validbstornot {
    public static int maxofleft(Node root){
        if(root.right==null){
            return root.data;
        }
        else{
            return maxofleft(root.right);
        }
    }
    public static int minofright(Node root){
        if(root.left==null){
            return root.data;
        }
        else{
            return minofright(root.left);
        }
    }
    public static boolean validbst(Node root){
        if(root==null){
            return true;
        }

        if(root.left!=null && maxofleft(root.left)>root.data){
            return false;
        }
        if(root.right!=null && minofright(root.right)<root.data){
            return false;
        }

        if(validbst(root.left)==false || validbst(root.right)==false){
            return false;
        }

        return true;

    }
    public static void main(String[] args) {
        Node root=null;

        Node n1=new Node(20);
        root=n1;
 
        n1=new Node(16);
        root.left=n1;
        n1=new Node(25);
        root.right=n1;
     
        root.left.left=new Node(5);
        root.left.right=new Node(18);

        root.right.left=new Node(19);
        root.right.right=new Node(26);

        boolean b=validbst(root);
        System.out.println(b);
    }
}
