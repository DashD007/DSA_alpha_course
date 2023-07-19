import java.util.*;
public class OOPS_question {
    public static void main(String[] args) {
       Complex c = new Complex(4,5);
       Complex d = new Complex(9,4);

       Complex a = Complex.add(c,d);
       Complex p = Complex.product(c,d);
       Complex f = Complex.diff(c,d);
       a.printComplex();
       p.printComplex();
       f.printComplex();
    }
}
class Complex{
    int real;
    int imag;

    public Complex(int r,int i){
        this.real = r;
        this.imag = i;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex product(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag* b.real)));
    }

    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(real!=0 && imag!=0){
            System.out.println(real+""+imag+"i");
        }
        else{
            System.out.println(real);
        }
    }
}
