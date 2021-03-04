public class pmi {
//(1*2+2*3)*(2*3+3*4)*.....*(n*(n+1)+(n+1)*(n+2))
    public static int mult(int n){
            if(n==1){
                return 8;
            }
            int m=mult(n-1)*(n*(n+1)+(n+1)*(n+2));
            return m;
    }
   public static void main(String []args){
       System.out.println(mult(2));
   }
}
