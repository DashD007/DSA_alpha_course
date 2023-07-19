public class lecture_50 {
    public static void main(String[] args) {
        char ch ='A';
        for(int line=1;line<=11;line++){
            for(int chr = 1;chr<=line;chr++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
