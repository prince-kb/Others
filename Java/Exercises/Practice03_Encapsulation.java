class Any{
    int a=0;
    float b=0;
    String c="0";
    //Method overloading
    void A(int a){
        this.a=a;
    }
    void A(int a,float b){
        this.a=a;
        this.b=b;
    }
    //Method Overriding
    String A(String c){
        this.c=c;
        return c;
    }
    void printAny(){
        System.out.println("a="+a+" b="+b+" c="+c);
    }
}

public class Practice03_Encapsulation {
    public static void main(String[] args) {
        Any z1 = new Any();
        Any z2 = new Any();
        Any z3 = new Any();
        z1.A(9);
        z2.A(23,09.888f);
        z3.A("09");
        z1.printAny();
        z2.printAny();
        z3.printAny();
    }
}
