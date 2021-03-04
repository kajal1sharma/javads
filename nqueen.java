public class nqueen {

    static boolean  checkConstraints(int board[][],int row,int col){
        //column
        for(int i=0;i<=row;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        //left diagnol
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1)
            return false;
        }

        //right diagnol
        for(int i=row,j=col;i>=0&& j<=3;i--,j++){
            if(board[i][j]==1)
            return false;
        }

        return true;

    }

    static void place4queen(int board[][],int row){
        if(row==4){
            for(int i=0;i<4;i++){
                        for(int j=0;j<4;j++){
                            System.out.print(board[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println();
                
            return;
        }

        for(int i=0;i<4;i++){
        if(checkConstraints(board,row,i)==true){
            board[row][i]=1;

            place4queen(board, row+1);
                board[row][i]=0;
            
            
                // return true;
            
        }

    }
        
        // return ;
    } 
    public static void main(String []args){

        int board[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        place4queen(board,0);
        // if(place4queen(board,0)==true){
        //     for(int i=0;i<4;i++){
        //         for(int j=0;j<4;j++){
        //             System.out.print(board[i][j]);
        //         }
        //         System.out.println();
        //     }
        //     //System.out.println();
        // }
        // else{
        //     System.out.println("no option left ");
        // }
    }
}
