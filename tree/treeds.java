import org.graalvm.compiler.graph.Node;
import java.util.*;
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
    // public static void inordernonrecursive(Node root){
    //     Stack<Node> st=new Stack<Node>();
    
    //     while(true){
    //         //inserting the left part
    //         while(root!=null){
    //             st.push(root);
    //             root=root.left;
    //         }
    //         if(st.empty()){
    //             break;
    //         }
    //         root=st.peek();
    //         st.pop();
            
    //         System.out.print(root.data+"  ");
            
    //         root=root.right;
            
            
    //     }
        
    //     }
    public static Node  insertbst(Node root,int data){

        if(root==null){
            Node temp =new Node(data);
            return temp;
        }
        if(data<root.data){
            root.left=insertbst(root.left, data);
        }
        else{
            root.right=insertbst(root.right, data);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
   public static void main(String[] args) {
       Node root=null;

       Node n1=new Node(20);
       root=n1;

       n1=new Node(16);
       root.left=n1;
       n1=new Node(21);
       root.right=n1;
    
       root.left.left=new Node(5);
       root.left.right=new Node(18);

       //root.right.left=new Node(22);
       root.right.right=new Node(22);
        insertbst(root,19);
       inorder(root);
      // inordernonrecursive(root);
   } 
}
