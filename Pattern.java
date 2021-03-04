public class Pattern {

    public static void printnumber(int a,int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        printnumber(a+1, n-1);
    }
    public static void printrow(int a,int n){
        if(n==0){
            return;
        }
        printnumber(a,n);
        System.out.println();
        printrow(a+n,n-1);
    }
    public static void main(String [] args){
        int a=11;
        printrow(a,5);
    }
}
