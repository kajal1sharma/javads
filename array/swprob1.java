package array;

public class swprob1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1,8,7,1,2,3,2,1,6};
        int key=3;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                key--;
            }
            else{
                key=3;
                i--;
            }
            if(key==0){
                key=3;
                cnt++;
            }
        }

        System.out.println("cnt"+cnt);
    }
}
