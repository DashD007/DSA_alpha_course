import java.util.ArrayList;
import java.util.Collections;
public class lecture_229 {
    public static void main(String[] args){
        //here we will learn about how to sort an arraylist..
        //to sort an arraylist there is class present in java which is 'Collections'..whose method sort() is to sort..
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(10);
        System.out.println(list);

        //to sort in ascending order..
        Collections.sort(list);
        System.out.println(list);

        // to sort in descending order..
        Collections.sort(list,Collections.reverseOrder());
        // here Collections.reverseOrder() is a camparitor which provide a logic while sorting the arraylist..
        System.out.println(list);
    }
}
