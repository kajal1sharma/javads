
class  schoolname{
    static String name="delhi public school";
}

public class school {
    
    public static void printschoolname(){
        System.out.println(schoolname.name);
    }
    public static void changeschoolname(){
        schoolname.name="mother divine public school";
    }
    public static void main(String []args){
       printschoolname();
       changeschoolname();
       printschoolname();
    }
}

