public class lecture_220 {
    public static int fact(int n){
        int k =1;
        for(int i=n;i>0;i--){
            k *= i;
        }
        return k;
    }
    public static int GridWays(int n,int m){
        int num = fact(n-1+m-1);
        int den = fact(n-1) * fact(m-1);
        int total = num/den;
        return total;
    }
    public static void main(String[] args) {

        // in this we will discuss about the modify version of gridways;
        // here we will use a trick which is we will use permutations;
        int n =3;
        int m =3;
        System.out.println(GridWays(3,3));

        //time complexity = O(n+m);
    }
}
