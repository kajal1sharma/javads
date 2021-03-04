class starpatt{
    static  void col(int n, int l){
        if(l==0)
        return;
        System.out.print((char)n+" ");
        col(n+1,l-1);

    }
    static void row(int ch,int length,int start){
        if(start==length+1)
        return;

        col(ch,start);
        System.out.println();
        row(ch,length,start+1);
        col(ch,start-1);
        System.out.println();

    }
    public static void main(String []args){
        int ch=65;
        row(ch,5,1);
    }
}