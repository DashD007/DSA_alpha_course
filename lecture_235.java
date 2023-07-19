import java.util.ArrayList;

public class lecture_235 {
    public static void PairSum(ArrayList<Integer> list , int target){
        //brute force approach
        //Time complexity = O(N^2);
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    System.out.println(list.get(i)+" "+list.get(j));
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        // find if any pair in a sorted arrayList has a target sum;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<7;i++){
            list.add(i);
        }
        PairSum(list,5);
    }
}
