package array;
import java.util.*;
public class twoSum{

    public static void main(String[] args) {
        //two elements can make up for this sum 
        int arr[]={2,4,7,12,7,5,8};
        int key=9;

//sorting
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==key){
                System.out.print(arr[i]+" "+arr[j]);
                break;
            }
            else if(sum>key){
                j--;
            }
            else if(sum<key){
                i++;
            }
        }




        //brute force
// boolean flag=true;
//         for(int  i=0;i<arr.length-1;i++){
//             int sum=0;
//             for(int j=i+1;j<arr.length;j++){
//                 sum=arr[i]+arr[j];
//                 if(sum==key){
//                     System.out.println(arr[i]+"  "+arr[j]);
//                     flag=false;
//                     break;
//                 }
//             }
//             if(flag==false){
//                 break;
//             }

//         }


    }
} 