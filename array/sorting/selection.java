package array.sorting;

public class selection {
    static void selection(int arr[]){
        //cycles
        for(int i=0;i<arr.length-1;i++){
            int mi=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[mi]>arr[j]){
                    mi=j;
                }
            }
            //shifting the elemnets mi
            int temp=arr[mi];
            for(int k=mi-1;k>=i;k--){
                arr[k+1]=arr[k];
            }
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,6,5,1,2,3,4};

        selection(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }

    }
}
