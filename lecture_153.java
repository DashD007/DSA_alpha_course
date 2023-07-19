public class lecture_153 {
    public  static int FastExpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1) != 0) {
                // calculating lsb
                ans = ans * a;
            }
                a = a*a;

            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExpo(3,5));
        System.out.println(FastExpo(5,3));
    }
}
