public class lecture_39 {
    public static void main(String[] args) {
        //reverse a number;
        int n =10899;
        int rev = 0;
        int last;
        while(n>0){
            last = n%10;
            rev = rev*10+ last;
            n =n/10;
        }
        System.out.println(rev);
    }
}
