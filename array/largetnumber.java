package array;

public class largetnumber {
    public static void main(String[] args) {

        int arr[]={2,6,43,87,12,56,89,100};
        int n=5;
        int maxvalue[]=new int[n];
        for(int i=0;i<n;i++){
            maxvalue[i]=Integer.MIN_VALUE;
        }
int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=0;
            for(int j=0;j<maxvalue.length;j++){
                    if(maxvalue[j]<arr[i]){
                        for(int k=maxvalue.length-2;k>=j;k--){
                            maxvalue[k+1]=maxvalue[k];
                        }
                        maxvalue[j]=arr[i];
                        flag=1;
                        break;
                    }
                    if(flag==1)
                    break;
            }
        }
        for(int i=0;i<maxvalue.length;i++){
            System.out.print(maxvalue[i]+"  ");
        }

        // int first=arr[0];
        // int second=Integer.MIN_VALUE;
        // int third=Integer.MIN_VALUE;
        
        // for(int i=1;i<arr.length;i++){
        //     if(first<arr[i]){
        //         third=second;
        //         second=first;
        //         first=arr[i];
        //     }
        //     else if(second<arr[i]){
        //         third=second;
        //         second=arr[i];
        //     }
        //     else if(third<arr[i]){
        //         third=arr[i];
        //     }
        // }
        // System.out.println(first+"   "+second+"  "+third);
    }
}
