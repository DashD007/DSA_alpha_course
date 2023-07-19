import java.sql.SQLOutput;
import java.util.*;
public class lecture_126 {
    public static int ShortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== 'n'){
                y++;
            }
            else if(str.charAt(i)=='s'){
                y--;
            }
            else if(str.charAt(i)=='w'){
                x--;
            }
            else if(str.charAt(i)=='e'){
                x++;
            }
        }
        int d = (x*x)+(y*y);
        int displacement = (int)Math.sqrt(d);
        return displacement;
    }
    public static void main(String[] args) {
        String str = "wneenesennn";
        System.out.println(ShortestPath(str));
    }
}
