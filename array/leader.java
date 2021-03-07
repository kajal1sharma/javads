package array;

public class leader {
    public static void main(String []args){
    int arr[]={2,16,3,4,7,5,4,3};
    //16,7,5,4,3
    //O(n^2)

    boolean flag=false;
   
    for(int i=0;i<arr.length;i++){
        flag=true;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                flag=false;
                break;
            }
        }
        if(flag==true){
          //  System.out.println(arr[i]);
        }
    }


    //O(n)

    int max=arr[arr.length-1];
    System.out.println(max);
    for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max){
                System.out.println(arr[i]);
                max=arr[i];
            }
        }
}
}
