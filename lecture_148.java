public class lecture_148 {
    public static int ClearLastIthBit(int n ,int i){
        int BitMask = (~0)<<i;
        return n&BitMask;
    }
    public static void main(String args[]){
        System.out.println(ClearLastIthBit(15,2));
        System.out.println(ClearLastIthBit(31,3));
    }
}
