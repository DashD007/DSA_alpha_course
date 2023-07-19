import java.util.ArrayList;

public class lecture_226 {
    public static void main(String[] args) {
        //here we will learn about how to print arraylist in reverse order..
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(6);
        list.add(2);
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
    }
}
