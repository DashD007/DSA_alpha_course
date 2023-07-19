//import java.util.Scanner;
import java.util.*;
public class lecture_46 {
    public static void main(String[] args) {
        //check the number is prime or not.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is prime number");
        }
        else{
            boolean isprime = true;
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime== true){
                System.out.println("number is prime");
            }
            else{
                System.out.println("number is not prime");
            }
        }
    }
}
