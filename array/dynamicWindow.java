package array;

public class dynamicWindow {
    public static void main(String[] args) {
        int arr[]={4,2,2,7,6,1,2,0,1,9,0};
        int target=8;

        int wstart=0;
        int wsize=Integer.MAX_VALUE;
        int wcurrentsum=0;

        for(int i=0;i<arr.length;i++){
            wcurrentsum=wcurrentsum+arr[i];

            while(wcurrentsum>=target){
                int currentwindowsize=i-wstart+1;
                wsize=Math.min(currentwindowsize,wsize);

                wcurrentsum=wcurrentsum-arr[wstart];
                wstart++;                

            }

        }
System.out.println(wsize);
    }
}
