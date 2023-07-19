import java.util.ArrayList;

public class lecture_233 {
    public static int AreaWater(ArrayList<Integer> list){
        int left = 0;
        int right = list.size()-1;
        int max = 0;
        while(left<right){
            int height = Math.min(list.get(left),list.get(right));
            int curr_max = height*(right-left);
            max = Math.max(max,curr_max);
            if(list.get(left)<list.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
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
