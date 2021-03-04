class square{
   
    static void doSquare(int n){
        if(n<=0)
        {
            System.out.println("the end");
        }
        else{
            System.out.println(n*n);
            doSquare(n-1);
        }
    }
    public static void main(String []args){
        doSquare(5);
    }
}