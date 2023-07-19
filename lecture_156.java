public class lecture_156 {
    public static void main(String[] args) {
        // in this we will learn about getter and setter methods of a class
        pen p1 = new pen();
        p1.SetColor("blue");
        p1.SetTip(5);
        System.out.println(p1.GetColor());
        System.out.println(p1.GetTip());
    }
}

class pen{
    private String color;
    private int tip;
    //setter
    public void SetColor(String color){
        this.color = color;
    }
    public void SetTip(int tip){
        this.tip = tip;
    }

    //getter
    public String GetColor(){
        return this.color;
    }
    public int GetTip(){
        return this.tip;
    }
}
