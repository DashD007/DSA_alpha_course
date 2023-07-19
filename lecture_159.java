
public class lecture_159 {
    public static void main(String[] args) {
        //in this lecture we will learn about types of constructors;
        // There are three types of constructor in java:::
        // non- parameterized constructors:- which don't take any parameter in this
        // parameterized constructors:- which takes parameter in it;
        // copy constructors:- take another object as a parameter in it and use to create a new object which are the same properties as the passed object has;
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Damodar","abcd");
        //Student2 s3 = new Student2(Student2 s2);

    }
}
class Student2{
    String name;
    String password;
    int roll;

    //non parameterized constructor
    Student2(){
        this.name = name;
        this.password = password;
        this.roll = roll;
    }

    //parameterized constructor
    Student2(String name,String password){
        this.name = name;
        this.password = password;
    }

    //copy constructor

    Student2( Student2 s1){
        this.name = s1.name;
        this.password= s1.password;
        this.roll = s1.roll;
    }
}
