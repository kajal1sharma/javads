import java.util.*;
class Nodess{
    int data;
    Nodess left;
    Nodess right;
    
    //height 
    int height;

    Nodess(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.height=1;
    }
} 
public class avl {
    static void getheight(Nodess root){
        int left=0,right=0;
        if(root.left!=null)    
        left=root.left.height;
        else if(root.right!=null){
            right=root.right.height;
        }
        if(left>right)
        root.height=left+1;
        else
        root.height=right+1;

    }
    static int getbalancefactor(Nodess root){
        if(root.left==null && root.right==null){
            return 0;
        }
        else if(root.left==null){
            return -1*root.right.height;
        }
        else if(root.right==null){
            return root.left.height;
        }
        else{
            return root.left.height-root.right.height;
        }
    }
static int updateheight(Nodess root){
    if(root==null){
        return 0;
    }
    else{
        int left=updateheight(root.left);
        int right=updateheight(root.right);
        root.height=left>right?left+1:right+1;
    }
    return root.height;
}
    static Nodess rightrotation(Nodess root){
            Nodess newroot=root.left;
            Nodess temp=root;

            temp.left=newroot.right;
            newroot.right=temp;
            updateheight(newroot);
            return newroot;


    }
    static Nodess leftrotation(Nodess root){
        Nodess newroot=root.right;
        Nodess temp=root;

        temp.right=newroot.left;
        newroot.left=temp;
        updateheight(newroot);
        return newroot;


}
    static Nodess insertNodess(Nodess root,int key){
        
        if(root==null){
            Nodess temp=new Nodess(key);
            return temp;
        }
        else if(key>root.data){
            root.right=insertNodess(root.right, key);

        }
        else if(key<root.data){
            root.left=insertNodess(root.left, key);
        }
        getheight(root);
        int balance=getbalancefactor(root);
//System.out.println(balance);
        if(balance>1 && key<root.left.data){
            return rightrotation(root);
        }
        if(balance >1 && key>root.left.data){
            leftrotation(root.left);
            return rightrotation(root);
        }
        if(balance<-1 && key>root.right.data){
            return leftrotation(root);
        }
        if(balance <-1 && key<root.right.data){
            rightrotation(root.right);
            leftrotation(root);
        }

        return root;
    }
    static void print(Nodess root){
        if(root==null){return ;}
        print(root.left);
        System.out.println(root.data+"  "+root.height);
        print(root.right);
    }
    public static void main(String[] args) {
        
        Nodess root=null;
        root=insertNodess(root,20);
       root= insertNodess(root,10);
       // print(root);
        root=insertNodess(root,5);
        print(root);
    }
}
