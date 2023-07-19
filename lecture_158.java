public class lecture_158 {
    public static void main(String[] args) {
        //in this lecture we will learn about constructors;
        // Constructors are the special method which is invoked automatically at the time of object creation

        //constructors have the same name as class or structure;
        //constructor don't have any return type(not even void);
        //Constructor only called once , at the time of object creation
        //memory allocation happens when constructor is called
        Student1 s1 = new Student1();
        s1.name = "Damodar";
        s1.roll = 98;
    }
}
class Student1{
    String name;
    int roll;
    Student1(){
        this.name = name;
        this.roll = roll;
    }
}
