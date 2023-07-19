public class lecture_219 {
    public static int GridWays(int i,int j,int n,int m){
        //base case
        if(i==n-1||j==m-1){
            return 1;
        }
        else if(i==n-1 || j==m-1){
            return 0;
        }
        int w1 = GridWays(i,j+1,n,m); // here we go right;
        int w2 = GridWays(i+1,j,n,m); // here we go down;
        return w1 +w2;
    }
    public static void main(String[] args) {
        // in this we will discuss about the problem of gridWays;
        int n =4;
        int m =4;
        System.out.println(GridWays(0,0,n,m));

        //time complexity = O(2^(n+m));
    }
}
