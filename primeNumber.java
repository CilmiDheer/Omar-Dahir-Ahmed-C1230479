import java.util.*;
public class primeNumber {
    public static void main (String[]args){
        System.out.println("soo gali tiro prime number ah: ");

        Scanner input=new Scanner(System.in);

        int number= input.nextInt();

        int p=0;

        for(int j=1;j<=number;j++){

            if (number % j==0){
                p++;
            }
        }
        if (p==2){
            System.out.println(number+ " waa prime number");
        }
        else{
            System.out.println(number + " ma ahan prime number");
        }
    }
}
