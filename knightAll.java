public class knightAll {
    static boolean constraintcheck(int board[][],int x,int y){
        if(x>=0&&x<=7 && y>=0 && y<=7 && board[x][y]==0){
            return true;
        }
        return false;
    }
    static void knight_tour(int board[][],int movenumber,int x,int y){
        if(movenumber==65){
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }

            System.out.println();
            return;
        }

      //  int xoptions[]={-2,-2,-1,1,2, 2, 1,-1};
        //int yoptions[]={-1, 1, 2,2,1,-1,-2,-2};
        //corrected form for faster results
        int xoptions[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yoptions[] = { 1, 2, 2,   1, -1, -2, -2, -1 };
        for(int i=0;i<8;i++){
            int nx=x+xoptions[i];
            int ny=y+yoptions[i];
            if(constraintcheck(board,nx,ny)==true){
                    board[nx][ny]=movenumber;
                knight_tour(board, movenumber+1, nx, ny);
                    board[nx][ny]=0;
               
            }
        }
        return ;
    }
    public static void main(String []args){
        int board[][]={{0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0},
                       {0,0,0,0,0,0,0,0}};
                board[0][0]=1;
            knight_tour(board,2,0,0);
            
    }
}
