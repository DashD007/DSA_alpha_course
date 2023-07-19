public class lecture_146 {
    public static int ClearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return (n&bitMask);
    }
    public static void main(String[] args) {
        System.out.println(ClearIthBit(10,1));
        System.out.println(ClearIthBit(15,3));
    }
}
