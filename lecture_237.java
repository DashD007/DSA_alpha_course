import java.util.ArrayList;

public class lecture_237 {
    public static void PairSum2(ArrayList<Integer> list, int target){
        int pivot =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int left = pivot+1;
        int right =pivot;
        while(right!=left){
            if(list.get(right)+list.get(left)== target){
                System.out.println(list.get(left)+" "+list.get(right));
                return;
            }
            else if(list.get(right)+list.get(left)< target){
                left = (left+1)%list.size();
            }
            else{
                right = (right+list.size()-1)% list.size();
            }
        }
    }
    public static void main(String[] args) {
        //find if any pair in a sorted & rotated arraylist has a target sum;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        PairSum2(list,26);
    }
}
