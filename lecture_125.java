import java.util.Scanner;
public class lecture_125 {
    public static void main(String[] args) {
        // check if a string is palindrome or not?
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean check =true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}
