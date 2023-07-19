public class lecture_166 {
    public static void main(String[] args) {
        //in this we will learn about hierarchial inheritance
        //      base class
        //      /      \
        //  derived    derived
        //   class      class

    }
}
class animals{
    void eat(){
        System.out.println("Eating..");
    }
    void breathe(){
        System.out.println("breathing..");
    }
}
class fish1 extends animals{
    void swims(){
        System.out.println("Swimming in water..");
    }
}
class bird extends animals{
    void fly(){
        System.out.println("fly in sky..");
    }
}
class mammal extends animals{
    void walk(){
        System.out.println("walk on land");
    }
}
