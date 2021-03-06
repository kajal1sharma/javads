public class knighttour {
    static boolean constraintcheck(int board[][],int x,int y){
        if(x>=0&&x<=7 && y>=0 && y<=7 && board[x][y]==0){
            return true;
        }
        return false;
    }
    static boolean knight_tour(int board[][],int movenumber,int x,int y){
        if(movenumber==65){
            return true;
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

                if(knight_tour(board, movenumber+1, nx, ny)==false){
                    board[nx][ny]=0;
                }
                else{
                    return true;
                }
            }
        }
        return false;
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
            if(knight_tour(board,2,0,0)==true){
                for(int i=0;i<8;i++){
                    for(int j=0;j<8;j++){
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("no valid config");
            }
    }
}
