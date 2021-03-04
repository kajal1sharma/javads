import javax.xml.transform.Source;

public class tree {
 
    static void towerhanoi(int n,char source,char destination,char aux ){

        if(n==1){
            System.out.println("Rod "+n+" is shifted from "+ source+" to "+destination);
            return;
        }

        towerhanoi(n-1,source,aux,destination);
        System.out.println("Rod "+n+"is shifted from "+ source+" to "+destination);
        towerhanoi(n-1,aux,destination,source);
        
    }
    public static void main(String []args){
        towerhanoi(4,'A','B','C' );
    }
}
