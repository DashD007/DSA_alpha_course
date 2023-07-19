import java.util.*;
public class lecture_68 {
    //code to convert binary to decimal
    public static int BinToDec(int n){
        int last;
        int power =0;
        int dec = 0;
        while(n>0){
            last = n%10;
            n=n/10;
            dec = dec + (last* (int)Math.pow(2,power));
            power++;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(BinToDec(101010));
    }
}
