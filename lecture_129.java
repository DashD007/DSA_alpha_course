public class lecture_129 {
    public static void main(String[] args) {
        // in this we will find the largest string among many other strings;
        String fruits[] = {"apple","mango","banana"};
        // to compare all the string we will use String class method-- .compareTo();
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
        //this method follows a lexographical method
    }
}
