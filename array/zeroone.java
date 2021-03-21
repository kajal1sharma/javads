package array;
class zeroone{
public static void main(String[] args) {
    int arr[]={0,0,0,1,1,1,1,0,0,0,1};

int i=0;
int j=arr.length-1;

while(i<j){
    while(arr[i]==0){
        i++;
    }
    while(arr[j]==1){
        j--;
    }
    if(i<j){
    arr[i]=0;
    arr[j]=1;
    }
}
for(int k=0;k<arr.length;k++){
    System.out.print(arr[k]+" ");
}

    // int count=0;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==1){
//             count++;
//         }
//     }

// int j=arr.length-1;
//     for(int i=count;i>0;i--){
//         arr[j]=1;
//         j--;
//     }
//     for(int i=0;i<=j;i++){
//         arr[i]=0;
//     }


//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
}    
}