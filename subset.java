import java.util.ArrayList;
public class subset {

    public static ArrayList<String> powerset(String s,int in){
        if(in==s.length()){
            ArrayList<String> ar=new ArrayList<>();
            ar.add("");
            return ar;
        }
        else{
            char c=s.charAt(in);

            ArrayList<String> temp=powerset(s,in+1);
            ArrayList<String> result=new ArrayList<>();
            for(int i=0;i<temp.size();i++){
                String ss=temp.get(i);
               for(int k=0;k<s.length();k++){
                   
                        result.add(ss+s.charAt(k));
                    
                }
            }
            return result;
        }
    }
    public static void main(String []args){
        ArrayList<String> a=new ArrayList<>();
        a=powerset("abc",0);
        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
    }
}
