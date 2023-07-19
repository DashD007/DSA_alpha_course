public class lecture_163 {
    public static void main(String[] args) {
        //in this lecture, we will learn about encapsulation;
        //encapsulation is one of the four pillar of object oriented programming;
        //encapsulation is when properties and methods of base class are passed on to a derived class

        fish shark = new fish();
        shark.fins = 3;
        shark.eat();
    }
}
//code

//base class / parent class
class animal{
    String Skin_color;
    void eat(){
        System.out.println("Eating...");
    }

    void breathe(){
        System.out.println("breathing...");
    }
}
//derived class / child class;
class fish extends animal{
    int fins;
    void swim(){
        System.out.println("Swimming...");
    }

}
