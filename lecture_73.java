public class lecture_73 {
    public static void Hollow_Rect(int totRow , int totCol){
        for(int i=1;i<=totRow;i++){
            for(int j=1;j<=totCol;j++){
                //cell -(i,j);
                if(i==1|| i==totRow ||j==1 || j==totCol){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_Rect(5,5);
    }
}
