public class lecture_131 {
    public static void main(String[] args) {
        // in this we will learn about StringBuilder class
        //StringBuilder are same as String dataStructure but the difference is we can change it multiple times;
        StringBuilder sb = new StringBuilder("");
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        sb.toString(); // this method is used to change any object into string;
        System.out.println(sb);
        // time complexity of this function is O(n);
    }
}
