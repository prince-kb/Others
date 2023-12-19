import java.io.*;
class Complex {
    private double real;
    private double imaginary;

    Complex(){
        real=10.0;
        imaginary=5.0;
    }
    Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex(Complex another){
        this.real=another.real;
        this.imaginary=another.imaginary;
    }

    public Complex addition (Complex c1){
        return new Complex(this.real + c1.real,this.imaginary + c1.imaginary);
    }
    public Complex subtraction (Complex c1){
        return new Complex(this.real - c1.real,this.imaginary - c1.imaginary);
    }
    public Complex multiplication (Complex c1){
        double r1=this.real*c1.real - this.imaginary*c1.imaginary;
        double r2=this.real*c1.imaginary + this.imaginary*c1.real;
        return new Complex(r1,r2);
    }
    void display(){
        System.out.println(this.real + " + " + this.imaginary+"i");
    }
}

public class ComplexProblem{
public static void main(String[] args)throws Exception{

    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter real and imaginary part of the first complex number : ");
    String [] input = read.readLine().split(" ");
    Complex c1 = new Complex (Double.parseDouble(input[0]),Double.parseDouble(input[1]));
    
    System.out.println("Enter real and imaginary part of the second complex number : ");
    input = read.readLine().split(" ");
    Complex c2 = new Complex (Double.parseDouble(input[0]),Double.parseDouble(input[1]));

    Complex c3 = new Complex();
    Complex c4 = new Complex(c1);
    Complex c5 = new Complex(c2);
    
    c3 = c1.addition(c2);
    c4 = c1.subtraction(c2);
    c5 = c1.multiplication(c2);

    System.out.print("Addition : ");
    c3.display();
    System.out.print("Subtraction : ");
    c4.display();
    System.out.print("Multiplication : ");
    c5.display();

    // c3.addition(c4).display();
    }
}