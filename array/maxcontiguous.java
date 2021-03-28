package array;

public class maxcontiguous {
   public static void main(String[] args) {
    int arr[]={4,-4,2,3,6,-8,2,9};   
   //int arr[]={-4,-3,-2,-1};
    int largestsum=arr[0];
       int wsum=0;

       for(int i=0;i<arr.length;i++){
            wsum=wsum+arr[i];

            if(largestsum<wsum){
                largestsum=wsum;
            }
            if(wsum<=0){
                wsum=0;
            }
       }

       System.out.println(largestsum);
   } 
}
