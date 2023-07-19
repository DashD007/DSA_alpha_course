public class lecture_function_questions {
    public static boolean palindrome(int n){
        int number = n;
        int rev=0;
        int last;
        while(n>0){
            last = n%10;
            n = n/10;
            rev = rev*10 +last;
        }
        System.out.println(rev);
        if(rev==number){
            return true;
        }
        else{
            return false;
        }
    }

    //quetion 5
    public static int SumOfDigit(int n){
        int last;
        int sum=0;
        while(n>0){
            last = n%10;
            n = n/10;
            sum += last;
        }
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println(palindrome(56));
//        System.out.println(palindrome(212));
        System.out.println(SumOfDigit(715));
    }
}
