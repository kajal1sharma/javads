package array;

public class unordered {
    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,8,7};
        
        
        
        int result1=0;
        int result2=0;

        //array element are xored
        for(int i=0;i<arr.length;i++){
            result1=result1 ^ arr[i];
        }
        
        //all natural numbers are xored
        for(int i=1;i<=arr.length+1;i++){
            result2=result2^ i;
        }

        //result are exored
        System.out.println(result2 ^ result1);
        
        
        
        
        
        
        
        
        // int hash[]=new int[arr.length+2];

        // for(int i=0;i<arr.length;i++){
        //     hash[arr[i]]=1;
        // }
        // for(int i=1;i<hash.length;i++){
        //     if(hash[i]==0)
        //     {
        //         System.out.println(i);
        //         break;
        //     }
        // }



    }
}
