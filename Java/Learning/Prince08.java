import java.util.Scanner;

class ReturnObject{
    int a;
    ReturnObject(int a){
        this.a=a;
    }
    ReturnObject createObject(){
        ReturnObject temp=new ReturnObject(a+10);
        //Returning an object
        return temp;
    } 
}

class TakeObject{
    int a,b;
    TakeObject(int a,int b){
        this.a=a;
        this.b=b;
    }

    void takingObject(TakeObject a1){
        a1.a=this.a;
        a1.b=this.b;
    }
}

public class Prince08{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter x : ");
        int x= scan.nextInt();

        //Returning Objects
        ReturnObject o1=new ReturnObject(x);
        ReturnObject o2;
        o2=o1.createObject();
        System.out.println("Made another object by returning an object and value of a = "+o2.a);

        //Objects as parameters
        TakeObject a1=new TakeObject(10,20);
        TakeObject a2=new TakeObject(11,34);

        System.out.println("Before object copying values of a and b are :"+a2.a+" "+a2.b);

        a1.takingObject(a2);

        System.out.println("After copying values of a and b from object a1 to a2 : "+a2.a+" "+a2.b);
    }
}