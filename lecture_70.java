public class lecture_70 {
    public static int DecToBin(int n){
        int pow=0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            n = n/2;
            bin = bin + rem*(int)Math.pow(10,pow);
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        System.out.println(DecToBin(10));
    }
}
