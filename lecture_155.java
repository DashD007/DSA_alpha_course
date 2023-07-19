public class lecture_155 {
    public static void main(String[] args) {
        // in this lecture we will learn about access modifiers;
        bankaccount acc = new bankaccount();
        acc.username = "damodar";
        //acc.password = "abcd1234";  we can't assign password like this;
        // to do this we need a setter method;
        acc.SetPwd("abcd1234");

    }
}
class bankaccount{
    public String username;
    private String password;

    public void SetPwd(String pwd){
        password = pwd;
    }
}
