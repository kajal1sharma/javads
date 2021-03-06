public class mcoloring {

    static boolean checkconstraint(int graph[][], int color[],int c,int vertex){

        for(int i=0;i<4;i++){
            if(graph[vertex][i]==1 && color[i]==c){
                return false;
            }
        }
        return true;
    }
    static boolean docoloring(int graph[][],int color[] , int n,int vertex){
        if(vertex==5){
            return true;
        }
        for(int c=1;c<=n;c++){
            if(checkconstraint(graph, color,c, vertex)==true){
                    color[vertex]=c;

                    if(docoloring(graph, color, n, vertex+1)==false){
                        color[vertex]=0;
                    }
                    else{
                        return true;
                    }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        
        int graph[][]={
            {0,1,1,1,0},
            {1,0,0,0,1},
            {1,0,0,1,1},
            {1,0,1,0,0},
            {0,1,1,0,0}
        };

        int n=3;//1,2,3
        
        int color[]={0,0,0,0,0};

        if(docoloring(graph,color,n,0)==true){
            for(int i=0;i<5;i++){
                System.out.println(color[i]);
            }
        }
        else{
            System.out.println("with these color we cannot caolor all our nodes");
        }

    }
}
