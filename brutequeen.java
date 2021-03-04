public class brutequeen {
    static boolean check(int board[][],int row,int col){
        //column check 
        int cnt=0;    
            for(int i=0;i<4;i++){
                if(board[i][col]==1){
                    cnt++;
                    if(cnt==2){
                        return false;
                    }
                }
            }
            
            //right diagonal check uppper

            for(int i=row-1,j=col+1;i>=0 && j<=3;i--,j++){
                if(board[i][j]==1)
                return false;
            }

            //right diagonal check Lower
            for(int i=row+1,j=col+1; i<=3 && j<=3 ;i++,j++){
                if(board[i][j]==1)
                return false;
            }
            //left diagonal check uppper

            for(int i=row-1,j=col-1 ; i>=0&& j>=0 ;i--,j--){
                if(board[i][j]==1)
                return false;
            }

            //left diagonal check Lower
            for(int i=row+1,j=col-1 ; i<=3 && j>=0 ;i++,j--){
                if(board[i][j]==1)
                return false;
            }
            return true;
    }

    static boolean constraint(int board[][]){
       int one=0;
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
                if(board[i][j]==1){
                    one=one+1;
                    if(check(board,i,j)==false){
                        return false;
                    }
                }

                if(one==4){
                    return true;
                }
           }
       }
       return false;
    }
    static void brute(int board[][],int queen){
        if(queen==4){
            //check for the constraints
            if(constraint(board)==true){
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        }
            return;
        }

        for(int i=0;i<4;i++){
            board[queen][i]=1;
            brute(board,queen+1);
            board[queen][i]=0;
        }
    }
   public static void main(String []args){

    
    int board[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
       brute(board,0);
   } 
}
