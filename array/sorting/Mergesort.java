package array.sorting;

public class Mergesort {

    static void merge(int arr[],int low ,int middle,int high){
        
       int leftsize=middle-low+1;
       int rightsize=high-middle;
       int left[]=new int[leftsize];
       int right[]=new int[rightsize];

        int k=0;
       for(int i=low;i<=middle;i++){
           left[k]=arr[i];
           k++;
       }
       k=0;
       for(int i=middle+1;i<=high;i++){
            right[k]=arr[i];
            k++;
        }   

        int i=0,j=0;
        k=low;
        while(i<leftsize && j<rightsize){
        if(left[i]<right[j]){
            arr[k]=left[i];
            i++;
        }
        else if(left[i]>right[j]){
            arr[k]=right[j];
            j++;
        }
        k++;
        }

        while(i<leftsize){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<rightsize){
            arr[k]=right[j];
            k++;
            j++;
        }

    }
    static void mergesortarr(int arr[],int low,int high){
        if(high>low){
            int middle=(low+high)/2;
            //left part
            mergesortarr(arr, low, middle);
            mergesortarr(arr, middle+1, high);
            merge(arr,low,middle,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,9,6,7,4,3,8};
   
        mergesortarr(arr,0,arr.length-1);
    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   
}
