import java.util.*;
public class Main {

    public static void  toinfix(String s){
        Stack<String> st =new Stack<String>();
        
        for(int i=s.length()-1; i>=0;i--){
            char c=s.charAt(i);
            if(c=='+'||c=='-'||c=='/'||c=='*'){
                String operand1=st.pop();
                String operand2=st.pop();
                
                String newstr="("+operand1+c+operand2+")";
                st.push(newstr);
            }
            else{
                //operands
                st.push(c+"");
            }
        }
        
        System.out.println(st.peek());
    }
    public static void main(String[] args) {
        String s="*/CD+AB";
        toinfix(s);
    }
}
