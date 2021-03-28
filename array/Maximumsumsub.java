package array;
import java.util.*;
public class Maximumsumsub{

    public static int maximumsum(int arr[],int k,int sum,int in){

        if(in==arr.length-1){
           sum=sum+arr[arr.length-1];
            return sum;
        }
        sum=sum+arr[in];
        List<Integer> li=new ArrayList<>();
        
        for(int i=in+1;i<=(in+k) && i<arr.length;i++){
           int max= maximumsum(arr, k, sum, i);
           li.add(max);
        }
        int tempmax=Integer.MIN_VALUE;
        for(int i=0;i<li.size();i++){
            if(tempmax<li.get(i)){
                tempmax=li.get(i);
            }
        }
        return tempmax;
    }
public static void main(String[] args) {
    int arr[]={11,-4,-2,1,0,4};
    int k=3;

    int sum=0;
    int maxsum=maximumsum(arr,k,sum,0);
    System.out.println(maxsum);
}
}