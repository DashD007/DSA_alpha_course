public class lecture_143 {
    public static void OddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) ==0){
            System.out.println("Even no.");
        }
        else{
            System.out.println("Odd no.");
        }
    }
    public static void main(String[] args) {
        // in this we will learn how to check if a number is odd or even using bit manipulation;
        // here we will use &(and) operator;
        OddorEven(5);
        OddorEven(9);
        OddorEven(4);
    }
}
