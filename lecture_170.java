public class lecture_170 {
    public static void main(String[] args) {
        // in this we will learn about method overriding..
        // parent and child classes both contain the same function with a different defination
        // this is runtime polymorphism
        deer d1 = new deer();
        d1.eat();
    }
}
class animal2{
    void eat(){
        System.out.println("eats anythings..");
    }
}
class deer extends animals{
    void eat(){
        System.out.println("eats grass..!");
    }
}
