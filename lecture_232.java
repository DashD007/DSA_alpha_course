import java.util.ArrayList;

public class lecture_232 {
    public static int AreaWater(ArrayList<Integer> list){
        int max =Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            //int cur_max = Integer.MIN_VALUE;
            for(int j=i+1;j<list.size();j++) {
                int height = Math.min(list.get(i), list.get(j));
                int cur_max = height * (j - i);
                max = Math.max(cur_max, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // find maximum area of water in given heights..
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(AreaWater(list));
    }
}
