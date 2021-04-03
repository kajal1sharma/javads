package array;

class BinarySearch{

    public static int bsearch(int arr[],int lo,int hi, int key){
        if(lo>hi){
            return -1;
        }
        else{
            int mid=lo+(hi-lo)/2;

            if(arr[mid]==key)
            return mid;
            else if(key<arr[mid]){
                   return  bsearch(arr,lo,mid-1,key);
            }
            else if(key>arr[mid]){
                    return bsearch(arr,mid+1,hi,key);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};

        int index=bsearch(arr,0,arr.length-1,45);

        if(index==-1){
            System.out.print("the element is not present");
        }
        else{
            System.out.print("the element is at "+index+"  index");
        }
    }
}