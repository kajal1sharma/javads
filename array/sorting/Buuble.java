package array.sorting;

public class Buuble {
    static void bubblesort(int arr[]){
        //loop for cycles   n elemeent =>n-1 times
        for(int i=0;i<arr.length-1;i++){
//loop for comparisions
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,6,7,1};

        bubblesort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
