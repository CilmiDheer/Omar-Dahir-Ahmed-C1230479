import java.util.*;
public class password_checker {
    public static void main (String[]args){

        System.out.println("fadlan soo gali numberka  password ah :  ");

        Scanner input=new Scanner(System.in);


        Random random=new Random();

        int tiro= input.nextInt();


        String uppurcase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String lowercase="abcdefghijklmnopqrstuvwxyz";

        String digit="0123456789";

        String specialCharector="$#@!%&*?";


        String AllCharectors=uppurcase + lowercase + digit + specialCharector;

        StringBuilder password = new StringBuilder();

        for (int i=0; i<tiro;i++){

            int index = random.nextInt(AllCharectors.length());

            char ch = AllCharectors.charAt(index);

            password.append(ch);
        }
        System.out.println("Password-kaagu waa: " + password.toString());

    }
}
