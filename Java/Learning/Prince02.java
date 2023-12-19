import java.util.Scanner;
public class Prince02 {

    static int method(int a,int b){
        return (a&b);
    }

    int method1(int x,int y){
        return (x|y);
    }

    //Variable arguments function
    static int method2(int z,int ...arr){
        int sum=z;
        for (int i : arr) 
            sum+=i;
        
        return sum;
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();

        //Method callling type 1
        int c=method(a,b);

        //Method calling type 2 by using class (named as call here)
        Prince02 call=new Prince02();
        int d=call.method1(a,b);
        System.out.println(a+"&"+b+"="+c);
        System.out.println(a+"|"+b+"="+d);

        //Using/Calling variable arguments
        System.out.println("Sum of 1 is "+method2(1));
        System.out.println("Sum of 1 and 4 is "+method2(1,4));
        System.out.println("Sum of -100 and 4 and 34 is "+method2(-100,4,34));
        System.out.println("Sum of -100 and 333 and 4 and 34 is "+method2(-100,333,4,34));
        System.out.println("Sum of -100 and 333 and 2 and 4 and 34 is "+method2(-100,333,2,4,34));
        System.out.println("Sum of -100 and 3 and 2 and 11 and 4 and 34 is "+method2(-100,3,2,111,4,34));
    }
}
