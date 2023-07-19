import java.util.ArrayList;

public class lecture_236 {
    public static void PairSum(ArrayList<Integer> list, int target){
        // optimized approach -- two pointer approach;
        //time complexity = O(n);
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            if(list.get(left)+list.get(right)== target){
                System.out.println(list.get(left)+" "+list.get(right));
                return;
            } else if (list.get(left)+list.get(right) <target) {
                left++;
            }
            else{
                right--;
            }
        }
    }
    public static void main(String[] args) {
        //optimized approach for pairSum..
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<7;i++){
            list.add(i);
        }
        PairSum(list,8);
    }
}
