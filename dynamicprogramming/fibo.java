public class fibo {
    static int fibonacci(int n,int arr[]){
        if(n==0)
        return arr[n];
        if(n==1)
        return arr[n];
        if(arr[n]!=0){
            return arr[n];
        }
        return arr[n]=fibonacci(n-1, arr)+fibonacci(n-2, arr);
    }
    public static void main(String[] args) {
        int arr[]=new int[7];

        arr[0]=0;
        arr[1]=1;
        System.out.println(fibonacci(6,arr)); 
    }
}
