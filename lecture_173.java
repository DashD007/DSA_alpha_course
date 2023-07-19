public class lecture_173 {
    public static void main(String[] args) {
        // in this lecture, we will learn about abstract class..we have to just write abstract before it
        horse h = new horse();
        h.eat();
        h.walk();

        chicken ch = new chicken();
        ch.eat();
        ch.walk();
        System.out.println("");
        mustang m = new mustang();
    }
}

abstract class animal3{
    animal3(){
        System.out.println("animals constructor is called..");
    }
    void eat(){
        System.out.println("animals eat");
    }
    abstract void walk();
}
class horse extends animal3{
    horse(){
        System.out.println("horse constructor is called..");
    }

    @Override
    void walk() {
        System.out.println("Walks on four legs..");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor is called..");
    }
}
class chicken extends animal3{
    @Override
    void walk() {
        System.out.println("Walks on two legs..");
    }
}