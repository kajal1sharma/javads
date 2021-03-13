package array;
//left rotate by one index

public class shiftby1 {

    public static void rotatearr(int arr[],int rotate){
        int temparr[]=new int[rotate];
            
        for(int i=0;i<rotate;i++){
            temparr[i]=arr[i];
        }

        for(int i=0;i<arr.length-rotate;i++)
        {
            arr[i]=arr[i+rotate];
        }

        for(int i=arr.length-rotate,j=0;i<arr.length;i++,j++){
            arr[i]=temparr[j];
        }
    }
   public static void main(String[] args) {
    int arr[]={1,2,2,7,44};
int rotate=3;//{7,44,1,2,2}

// for(int j=0;j<rotate;j++){

//         int temp=arr[0];
//         for(int i=1;i<arr.length;i++){
//             arr[i-1]=arr[i];
//         }
//         arr[arr.length-1]=temp;
// }
rotatearr(arr,rotate);
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}



   } 
}
