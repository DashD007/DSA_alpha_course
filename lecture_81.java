public class lecture_81 {
    public static void hollow_rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1||j==n||i==1||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}
