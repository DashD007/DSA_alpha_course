public class lecture_147 {
    public static int UpdateIthBit(int n, int i, int newBit){
        // clear ith bit
        int BitMask = ~(1<<i);
        n = n&BitMask;
        // now setBit
        BitMask = newBit<<i;
        return n|BitMask;
    }
    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10,2,1));
    }
}
