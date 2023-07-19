public class practice {
    public static void cross(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j || j==5-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowRECT(int l, int b){
        /*
        *****
        *   *
        *   *
        *****
        */
        //outer loop
        for(int i=1;i<=l;i++){ // rows
            for(int j=1;j<=b;j++){ //columns
                if(i==1||i==l||j==1||j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void half_py(int n){
        for(int i=1;i<=n;i++){ //outer loop -->rows
            for(int j=1;j<=n-i;j++){ // to print empty space;
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ // to print star;
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollowRECT(4,5);
        half_py(6);
    }
}
