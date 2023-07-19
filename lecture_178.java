public class lecture_178 {
    public static void printnumber(int n){
        if(n!=1){
            System.out.println(n);
            printnumber(n-1);
        }
        else{
            System.out.println(1);
        }

    }
    public static void main(String[] args) {
        // in this lecture we will print numbers from n to 1 in decreasing order...
        // n n-1 n-2 n-3 ...1
        printnumber(5);
    }
}

