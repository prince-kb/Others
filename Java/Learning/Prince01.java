import java.util.Scanner;

public class Prince01 {
    public static void main(String args[]){

        //Declaration of array
        //1>

        // int [] array;
        // array = new int [5];

        // 2>
        int [] array=new int [5];
        
        Scanner scan=new Scanner(System.in);


        for(int i=0;i<5;i++){
            array[i]=scan.nextInt();
        }

        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }

            //for each loop
        // for (int element  : array) {
        //     System.out.println(element);
        // }

        System.out.print("Enter a number : ");
        byte a=scan.nextByte();

            //New switch loop with included break statement
        switch(a){
            case 0 -> System.out.println("Number is zero");
            case 1 -> System.out.println("Number is one");
            case 2 -> System.out.println("Number is two");
            case 3 -> System.out.println("Number is three");
            default -> System.out.println("Number is greater than 3");
        }

    }
}
