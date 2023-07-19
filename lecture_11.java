import java.util.Scanner;
public class lecture_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // this only take a word as a input
        String name = sc.nextLine(); // this take the whole line as a input
        int num = sc.nextInt(); // this take a number as a input
        float price = sc.nextFloat(); // this take a float number as input
        System.out.println(input);
        System.out.println(name);
        System.out.println(num);
        System.out.println(price);

    }
}
