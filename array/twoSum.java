package array;
import java.util.*;
public class twoSum{
//with repetative elements try hashing
    public static void main(String[] args) {
        //two elements can make up for this sum 
        int arr[]={5,2,4,7,12,17,8};
        int key=10;


        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],1);
        }
        //System.out.println(hm);

        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            int left=key-arr[i];
            if(sum!=left && hm.containsKey(left)){
                System.out.println(arr[i]+" "+left);
                break;
            }
        }

        // //hashing

        // int hash[]=new int[50];
        // for(int i=0;i<arr.length;i++){
        //     hash[arr[i]]=1;
        // }

        // for(int i=0;i<arr.length;i++){
        //     int sum=arr[i];
        //     int left=key-sum;
        //     if(left<key && hash[left]==1){
        //         hash[left]=0;
        //         hash[arr[i]]=0;
        //         System.out.println(arr[i]+" "+left);
        //       //  break;
        //     }
        // }




//sorting
        // Arrays.sort(arr);
        // int i=0;
        // int j=arr.length-1;

        // while(i<j){
        //     int sum=arr[i]+arr[j];
        //     if(sum==key){
        //         System.out.print(arr[i]+" "+arr[j]);
        //         break;
        //     }
        //     else if(sum>key){
        //         j--;
        //     }
        //     else if(sum<key){
        //         i++;
        //     }
        // }




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