public class lecture_27 {
    public static void main(String[] args) {
        int a = 33;
        int b = 255;
        int c = 866;
//        if((a>=b) && (a>=c)){
//            System.out.println("A");
//        }
//        else if(b>=c){
//            System.out.println("B");
//        }
//        else{
//            System.out.println("C");
//        }
//    }
        if(a>b){
            if(a>c){
                System.out.println("a");
            }
            else{
                System.out.println("c");
            }
        }
        else if(b>c){
            if(b>a) {
                System.out.println("b");
            }
            else{
                System.out.println("a");
            }
        }
        else {
            System.out.println("C");
        }

    }
}
