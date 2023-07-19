public class lecture_154 {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void CalcPercentage(int math, int chem, int phys){
        percentage = (math+chem+phys)/3;
    }
}
