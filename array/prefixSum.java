package array;

public class prefixSum {
    public static void main(String[] args) {
        int arr[]={1,5,3,7,4,2,5,8,54};

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}
