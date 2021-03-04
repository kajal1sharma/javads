class staticex{
    static int x=1;
    public static int example(int n){
        if(n>0){
            int sum= example(n-1)+x;
            x=x+1;
            return sum;
            
        }
        return 0;
    }
    public static void main(String []args){
        System.out.println(example(5));
    }
}