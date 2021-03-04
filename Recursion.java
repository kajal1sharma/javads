public class Recursion {
    
    private static void getBinary(int num,String s) {
       if(num==0){
           System.out.println(s);
       }
       else{
           int rem=num%2;
           num=num/2;
           getBinary(num, rem+s);
       }
        }
     

    public static void main(String[] args) {
        
      getBinary(16 ," ");
    }
}
