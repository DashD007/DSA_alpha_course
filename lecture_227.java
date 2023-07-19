import java.util.ArrayList;

public class lecture_227 {
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        //in this lecture we will learn about how to swap two elements at given index in ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(6);
        list.add(2);
        System.out.println(list);
        Swap(list,1,3);
        System.out.println(list);

    }
}
