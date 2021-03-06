//problem 22
public class paranthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        paran(list,n,"");
        return list;
    }
    
    public void paran( List<String> list,int n,String s){
        
        if(s.length()==n*2){
            //if(checkparan(s)==true){
               list.add(s);
            //}
            
            return;
        }
        
        if(checkparan(s+'(',n)==true){
            paran(list,n,s+'(');
        }
        if(checkparan(s+')',n)==true)
        paran(list,n,s+')');
    }
    
    public boolean checkparan(String s,int n){
    
        int opening=0;
        int closing=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                opening++;
            }
            else if(s.charAt(i)==')'){
                closing++;
            }
        }
        
        if(opening<=n && opening>=closing){
            return true;
        }
        else{
            return false;
        }
    }
}class paranthesis {
    
}
