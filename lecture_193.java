public class lecture_193 {
    public static void BinaryString(int n,int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        BinaryString(n-1,0,str+"0");
        if(lastplace==0){
            BinaryString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        String str ="";
        BinaryString(3,0,str);
    }
}
