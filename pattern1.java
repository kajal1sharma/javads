//permutation 
//maze
public class pattern1 {

    public static int fibo(int n){
 
        if(n==1)
        return 1;
        if(n==2)
        return 1;

        int t1=fibo(n-1);
        int t2=fibo(n-2);

        return t1+t2;

        //return fibo(n-1)+fibo(n-2);
    }
    public static void main(String []args){
     System.out.print(fibo(6));
    }

}
