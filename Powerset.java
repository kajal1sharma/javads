import java.util.ArrayList;
public class Powerset {

    public static ArrayList<String> permWithoutRep(String s,int in ){

        if(in==s.length()){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        ArrayList<String> temp=permWithoutRep(s, in+1);
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<temp.size();i++){
            
            String str=temp.get(i);
            System.out.println(str);
            for(int j=0;j<=str.length();j++){
                result.add(str.substring(0,j)+s.charAt(in)+str.substring(j));
            }
        }
        System.out.println("level :: completed");
        return result;
    
    }
    public static void main(String []args){
        ArrayList<String> ar=permWithoutRep("abc",0);
       
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        
    }
}
