package array.sorting;

class quicksort{

    static int partition(int arr[],int lo,int high){
        int pivot=arr[high];
       int i=lo;
       int j=high-1;
       int pivotindex=high;

       while(true){
       while(i< high && arr[i]<pivot  ){
           i++;
       }
       while(j>lo && arr[j]>pivot){
           j--;
       }
       if(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }

       if(i>=j){
         
           int temp=arr[i];
           arr[i]=arr[pivotindex];
           arr[pivotindex]=temp;
           pivotindex=i;
           break;
       }
    }
    return pivotindex;
    }
    static void quicksortarr(int arr[],int lo,int high){

        if(lo<high){
        int indexpivot=partition(arr,lo,high);
        quicksortarr(arr,lo,indexpivot-1);
        quicksortarr(arr, indexpivot+1, high);
        }
    }

    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,1,6,9,4,8};

        quicksortarr(arr,0,arr.length-1);
        print(arr);

    }
}