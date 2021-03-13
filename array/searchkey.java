package array;

public class searchkey {
    public static void main(String[] args) {
        int arr[]={1,2,2,7,44,5,78,54,4,8,444,4,3,3};
        //unordered
        int key=8;
        //1
        //3
        //44
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("ele found at "+i);
                break;
            }
        }

    }
}
