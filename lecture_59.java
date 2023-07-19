public class lecture_59 {
    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f *= i;
        }
        return f;
    }
    public static int binoCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int coeff = n_fact / (r_fact*nmr_fact);
        return coeff;
    }
    public static void main(String[] args) {
        System.out.println(binoCoeff(5,2));
    }
}
