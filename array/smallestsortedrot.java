package array;

public class smallestsortedrot {

    public static int bsearch(int arr[],int lo,int hi){
        
        int mid=lo+(hi-lo)/2;

        if(arr[mid]<arr[mid-1]){
            return mid;
        }
        else{
            if(arr[hi]<arr[mid]){
                return bsearch(arr,mid+1,hi);
            }
            else if(arr[hi]>arr[mid]){
                return bsearch(arr, lo, mid-1);
            }
        }
return -1;
    } 

    public static void main(String[] args) {
        //int arr[]={40,50,60,10,20,30};
        int arr[]={10,20,30,40,50,60};
        int index=bsearch(arr,0,arr.length-1);
        System.out.println(index);
    }
}
