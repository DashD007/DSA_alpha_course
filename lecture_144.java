public class lecture_144 {
    public static int getIthBit(int n,int i){
        int BitMask = 1<<i;
        if(( n& BitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(5,2));
        System.out.println(getIthBit(15,3));
    }
}
