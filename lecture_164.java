public class lecture_164 {
    public static void main(String[] args) {
        //in this lecture, we will learn about single level inheritance;
        // this is the simplest inheritance... base class --> derived class
        child ch = new child();
        ch.study();
        ch.eat();
        ch.name = "rakesh";
        ch.last_name = "sharma";
    }
}

//base class
class parent{
    String name;
    String last_name;

    void eat(){
        System.out.println("Eating..!");
    }
}
//derived class
class child extends parent{
    void study(){
        System.out.println("Studies..!");
    }
}
