public class lecture_192 {
    public static int friendspairing(int n){
        //base case
        if(n==1|| n==2){
            return n;
        }
        //single
        int fnm1 = friendspairing(n-1);
        //pairing
        int fnm2 = friendspairing(n-2);
        int ways = (n-1)*fnm2;

        int totways = fnm1 + ways;
        return totways;
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
        System.out.println(friendspairing(4));
    }
}
