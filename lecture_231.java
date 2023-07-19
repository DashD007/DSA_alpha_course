import java.util.ArrayList;

public class lecture_231 {
    public static void main(String[] args) {
        // in this lecture..we will learn how to create an 2 D array or multidimensional array..
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        //adding elements to arrays
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr2.add(2);
        arr2.add(4);
        arr2.add(6);
        arr2.add(8);
        arr2.add(10);
        arr3.add(3);
        arr3.add(6);
        arr3.add(9);
        arr3.add(12);
        arr3.add(15);

        //adding arrays into arraylist..
        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            ArrayList<Integer> currList = list.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println("");
        }
    }
}
