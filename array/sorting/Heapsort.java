package array.sorting;

public class Heapsort {

    static void maxheap(int arr[],int i,int len){
        
        int li=i*2+1;
        int ri=li+1;
        int largest=i;

        if(li<len && arr[largest]<arr[li]){
            largest=li;
        }
        if(ri<len && arr[largest]<arr[ri]){
            largest=ri;
        }

        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            maxheap(arr,largest,len);
        }

    }

    static void  heapsortarr(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            maxheap(arr,i,arr.length);
        }

        for(int i=arr.length-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;

            maxheap(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,9,6,7,4,3,8};
   
        heapsortarr(arr);
    
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
