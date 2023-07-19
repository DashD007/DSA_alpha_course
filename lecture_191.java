public class lecture_191 {
    public static void RemoveDuplicates(String str,int idx ,StringBuilder newStr , boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar -'a'] == true){
            RemoveDuplicates(str, idx + 1, newStr, map);
        }
        else{
            map[currchar -'a'] =true;
            RemoveDuplicates(str,idx+1,newStr.append(currchar),map);
        }
    }
    public static void main(String[] args) {
        // in this lecture, we will write a function to remove duplicates characters from the string
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder("");
        boolean map[] = new boolean[26];
        RemoveDuplicates(str,0,newStr,map);
    }
}
