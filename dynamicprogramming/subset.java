public class subset {
    public static void main(String[] args) {
        int set[]={2,4,6,8};
    
        int sum=10;

        int matrix[][]=new int[1+set.length][sum+1];

        for(int i=0;i<=set.length;i++){
            for(int j=0;j<=sum;j++){
                if(i==0||j==0){
                    matrix[i][j]=0;
                }
                else if(j<set[i-1]){
                    matrix[i][j]=matrix[i-1][j];
                }
                else if(j==set[i-1]){
                    matrix[i][j]=1;
                }
                else{
                    int a=j-set[i-1];//4  5
                    int b=matrix[i-1][a];
                    if(b==1){
                        matrix[i][j]=1;
                    }
                    else{
                        matrix[i][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<=set.length;i++){
            for(int j=0;j<=sum;j++){
         System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(matrix[set.length][sum]);
    }
}
