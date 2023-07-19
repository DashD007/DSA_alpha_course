import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class practice_question_arrayList {
    public static boolean Monolithic(ArrayList<Integer> list){
        if(list.get(0)<list.get(1)){
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<list.get(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

//    public static void Lonely(ArrayList<Integer> list){
//        Collections.sort(list);
//        int n =list.size()-1;
//        if((list.get(0)!=list.get(1))&&(list.get(0)+1!= list.get(1))){
//            System.out.print(list.get(0)+" ");
//        }
//
//        for(int i=1;i<list.size()-1;i++){
//            if((list.get(i)-1== list.get(i-1))||(list.get(i)+1==list.get(i+1))||(list.get(i)==list.get(i+1))){
//                continue;
//            }
//            else{
//                System.out.print(list.get(i)+" ");
//            }
//        }
//
//        if((list.get(n)!=list.get(n-1))&&(list.get(n)-1!=list.get(n-1))){
//            System.out.print(list.get(n)+" ");
//        }
//    }

    public static void Lonely(ArrayList<Integer> list){
        int n = list.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(list.get(i))>1||map.containsKey(list.get(i)-1)||map.containsKey(list.get(i)+1)){
                continue;
            }
            else{
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println("");
    }

    public static void FrequentlyOccurence(ArrayList<Integer> list, int num){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)==num){
                temp.add(list.get(i+1));
            }
        }
//        int k=temp.get(0);
//        int count =0;
//        for(int i=0;i<temp.size();i++){
//            for(int j=i+1;j<temp.size();j++){
//
//            }
//        }
        Collections.sort(temp);
//        int k =0;
//        for(int i=0;i<temp.size();i++){
//            if
//        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        System.out.println(Monolithic(list));
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(Monolithic(list1));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(5);
        list3.add(3);
        Lonely(list3);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(6);
        list4.add(5);
        list4.add(8);
        Lonely(list4);
    }
}
