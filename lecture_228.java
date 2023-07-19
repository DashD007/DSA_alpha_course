import java.util.ArrayList;

public class lecture_228 {
    public static void main(String[] args) {
        // find maximum of an arraylist
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(2);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(list.get(i),max);
        }
        System.out.println(max);
    }
}
