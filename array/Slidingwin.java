package array;

class Slidingwin{
    public static void main(String[] args) {
        int arr[]={11,-4,2,6,4,9,5};
        int k=3;

        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
        }
int i=0;
        for(int j=k;j<arr.length;j++){
        sum=sum-arr[i]+arr[j];
        i++;
        if(sum>max){
            max=sum;
        }    
        }
        System.out.println(max);
    }
}