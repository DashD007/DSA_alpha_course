public class lecture_211 {
    public static void Subset(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //aayega
        Subset(str,ans+str.charAt(i),i+1);
        //nahi aayega
        Subset(str,ans,i+1);
    }
    public static void main(String[] args) {
        // here we learn how to find subset of a string
        String str = "abc";
        Subset(str,"",0);
    }
}
