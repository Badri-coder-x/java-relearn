public class LearningSubstring {

    public static void main(String [] args){

        String name = "BaDrInath";
        String email = "badri23@ubisoft.com";
        System.out.println(capitalize(name));
        System.out.println("Username: "+ email.substring(0,email.indexOf("@")));
        System.out.println("Domain: "+email.substring(email.indexOf("@")+1));


    }

    public static String capitalize(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();

    }
}
