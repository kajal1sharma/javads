import org.graalvm.compiler.graph.Node;

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
public class treeds {
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data+"  ");
        inorder(root.right);
    }
   public static void main(String[] args) {
       Node root=null;

       Node n1=new Node(12);
       root=n1;

       n1=new Node(14);
       root.left=n1;
       n1=new Node(16);
       root.right=n1;
    
       root.left.left=new Node(18);
       root.left.right=new Node(20);

       root.right.left=new Node(22);
       root.right.right=new Node(24);

       inorder(root);
   } 
}
