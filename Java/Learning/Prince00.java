//To use scanning
import java.util.Scanner;
class Prince00{
    public static void main(String args[]){
        System.out.println("Taking input: ");

        //Define some scanning function ie sc here
        Scanner sc=new Scanner(System.in);

        //Use defined scanner name to take input

        //Eight literals{

        //-128 to 127
        System.out.print("Enter a byte : ");
        byte a=3;
        a=sc.nextByte();
        
        //-2^16 to 2^16 - 1
        System.out.print("Enter a short : ");
        short b=12;
        b=sc.nextByte();
        
        //-2^32 to 2^32 - 1
        System.out.print("Enter a int : ");
        int c=123;
        c=sc.nextInt();
        
        //-2^32 to 2^32 - 1
        System.out.print("Enter a long : ");
        long d=127783;
        d=sc.nextLong();
        
        //Decimal Values // f or F can be declared
        System.out.print("Enter a float : ");
        float e=12.3f;
        e=sc.nextFloat();
        
        //Long decimal values // d or D can be declared
        System.out.print("Enter a double : ");
        double f=12.3334d;
        f=sc.nextDouble();
        
        //Characters
        System.out.print("Enter a char : ");
        char g='a';
        g=sc.next().charAt(0);
        
        //Boolean values
        System.out.print("Enter a boolean : ");
        boolean h=true;
        h=sc.nextBoolean();

    // }
            //Takes value upto space
        String str1=sc.next();

        //Takes whole string
        String str2=sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println(str1);
        System.out.println(str2);
    }
}