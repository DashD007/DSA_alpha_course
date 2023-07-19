

public class lecture_161 {
    public static void main(String[] args) {
        //in this lecture we will learn about shallow deep copy in constructor;

        // Shallow copy is a type of copy in which no new object is created or no new memory is used. thus we only use references.
        // and hence changes will reflect if a change is happend on the original array;

        //deep copy is a type of copy in which a new memory is used to create an array;
        //which make it to not reflect changes in duplicate array because of change in original array;


    }
}
class Student3{
    String name;
    String password;
    int roll;
    int marks[] = new int[3];

    Student3(){
    }


//    //Shallow copy
//    @Contract(pure = true)
//    Student3(@NotNull Student3 s1){
//        this.name = s1.name;
//        this.password = s1.password;
//        this.roll = s1.roll;
//        this.marks = s1.marks;
//    }
//
//    //deep copy constructor
//    Student3(Student3 s1){
//        this.name = s1.name;
//        this.password = s1.password;
//        this.roll = s1.roll;
//
//        for(int i=0;i<3;i++){
//            this.marks[i] = s1.marks[i];
//        }
//    }
}