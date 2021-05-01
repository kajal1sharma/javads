class Stack{

    int top=-1;
    int arr[]=null;
    Stack(){
        this.arr=new int[10];
    }
    Stack(int size){
        this.arr=new int[size];
    }

    public void push(int data){
        if(this.arr.length-1==this.top){
            System.out.println("stack overflow");
            return;
        }
        else{
            this.top=this.top+1;
            this.arr[this.top]=data;
        }
    }

    public void pop(){
        if(this.top==-1){
            System.out.println("stack underflow");
        }
        else{
            this.top=this.top-1;
        }
    }

    public int size(){
        return this.top+1;
    }

    public int topele(){
        return this.top>-1?this.arr[this.top]:-1;
    }

    public boolean empty(){
        if(this.top==-1){
            return true;
        }
        else{
            return false;
        }
    }

}


public class Stackarr {
public static void main(String[] args) {
    Stack st=new Stack(5);
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    System.out.println(st.topele());
    st.pop();
    System.out.println(st.topele());
}

    
    
}
