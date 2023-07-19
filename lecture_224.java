import java.lang.reflect.Array;
import java.util.ArrayList;
public class lecture_224 {
    public static void main(String[] args) {
        //here we will learn about the operations used on ArrayList..
        ArrayList<Integer> list = new ArrayList<>();
        //add operation
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

        //get operation -- to access to element
        int ele = list.get(2); // here 2 is the index
        int x  = list.get(4); // here 5 is the index;
        System.out.println(ele);
        System.out.println(x);

        //remove element operation -- to remove an element from arraylist
        System.out.println(list.remove(3)); // here 3 is the index whose element is going to be removed;
        int c = list.remove(2);
        System.out.println(c);

        //set operation -- to update an element in arraylist
        list.set(1,10); // here, 1 is index and 10 is new element
        System.out.println(list);

        //contains operation -- this will return boolean value.. true if the element is present.. false if the element is not present
        System.out.println(list.contains(5));
        System.out.println(list.contains(11));

        //add operation -- to add an element at a particular index.... time complexity = O(n);
        list.add(3,8);
        System.out.println(list); //here 3 is index and 8 is element




    }
}
