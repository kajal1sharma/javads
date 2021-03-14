package array;

public class orderedfindmissing {

    static int binarysearch(int arr[],int low,int high){
        int n=arr.length;
        if(low>high){
            return 0;
        }

        int mid=low+(high-low)/2;

        if(mid+1 !=arr[mid]){
        System.out.println(mid+1);
        return 1;
        }
        if(binarysearch(arr,low,mid-1)==1)
        return 1;
        if(binarysearch(arr, mid+1, high)==1)
        return 1;

        return 0;

    }

    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,8,7};

        //sum of first n natural=n(n+1)/2;

        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int arrsum=0;

        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }

        System.out.println(sum-arrsum);

        //hash table
        //array=>indexes key
        int hash[]=new int[arr.length+1];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=i+1){
        //         System.out.println(i+1);
        //         break;
        //     }
        // }

        // if(binarysearch(arr,0,arr.length-1)==0){
        //     System.out.println(arr.length+1);
        // }
       

    }
}
