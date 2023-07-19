public class lecture_169 {
    public static void main(String[] args) {
        // in this lecture, we will learn about method overloading..
        // method loading happens when multiple functions have same name but different parameters..
        calculator c1 = new calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.sum(1.5f ,2.5f));
    }
}
class calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
    float sum(float a,float b){
        return a+b;
    }
    // these function have same name but different type or no. of parameters... this is method overloading
}
