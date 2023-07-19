public class lecture_187 {
    public static int Power(int x,int n){
        if(n==1){
            return x;
        }
        else{
            int pow = x*Power(x,n-1);
            return pow;
        }
    }
    public static void main(String[] args) {
        // in this lecture we will print x to the power n;
        System.out.println(Power(2,10));
    }
}
