class Permutation{

    static void permutationString(String s,String newstr){

        if(newstr.length()==s.length()){
            System.out.println(newstr);
            return;
        }

        for(int i=0;i<s.length();i++){
            permutationString(s,newstr+s.charAt(i));
        }
        
    }
    public static void main(String[] args){
        permutationString("abcdef","");
        
    }
}