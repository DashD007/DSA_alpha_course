import java.util.Scanner;
public class lecture_85 {
    public static void main(String[] args) {
        //in this we will learn about input output in array;
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        //inputing values
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //output
        System.out.println("phys "+ marks[0]);
        System.out.println("chem "+ marks[1]);
        System.out.println("maths "+ marks[2]);

        //updating the value;
        marks[2] = marks[2]+1;
        System.out.println("maths "+marks[2]);

        //using the values;
        int percentage = (marks[1]+marks[2]+marks[3])/3;
        System.out.println("percentage: "+ percentage +"%");

        //finding length of array;
        System.out.println(marks.length);
    }
}
