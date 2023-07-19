public class lecture_165 {
    public static void main(String[] args) {
        //in this lecture, we will learn about multi level inheritance..
        // base class --> child class --> child class
        childs ch = new childs();
        ch.eat();
    }
}
class grandparent{
    void eat(){
        System.out.println("eating..!");
    }
}
class parents extends grandparent{

}
class childs extends parents{

}
