public class super_digit {
    public static int superDigit(int n,int k){
        //base case
        if(n<10){
            return n;
        }
        int temp =n;
        int sum =0;
        while(temp>0){
            int rem = temp%10;
            temp = temp/10;
            sum += rem;
        }
        sum *= k;
        return superDigit(sum,1);
    }
    public static void main(String[] args) {
        System.out.println(superDigit(148,3));
    }
}
