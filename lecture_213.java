public class lecture_213 {
    public static void FindPermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int j=0;j<str.length();j++){
            char curr = str.charAt(j);
            String newStr = str.substring(0,j)+ str.substring(j+1,str.length());
            FindPermutation(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        // here we discuss find permutation of a given string problem
        String str = "abc";
        FindPermutation(str,"");
    }
}
