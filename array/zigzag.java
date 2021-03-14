package array;

public class zigzag {
    public static void main(String[] args) {
        //<,>
        int arr[]={2,5,7,8,94,4,2,3,465};
    
        int flag=0;//0=>smaller
        for(int i=0;i<arr.length-1;i++){

            if(flag==0){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
                flag=1;
        }
            else{
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            flag=0;
        }
        }
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
    }
}
