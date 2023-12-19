
class Circle{
    float radius=0;
    Circle(float r){
        this.radius=r;
    }
    void periCircle(){
        System.out.println("Perimeter of Circle = "+2*3.142*radius);
    }
}
class Rectangle{
    float length=0,width=0;
    Rectangle(float l,float w){
        this.length=l;
        this.width=w;
    }
    void PeriRectangle(){
        System.out.println("Perimeter of Rectangle = "+2*(length+width));
    }
}
class Square{
    float side=0;
    Square(float s){
        this.side=s;
    }
    void PeriSquare(){
        System.out.println("Perimeter of Square = "+4*side);
    }
}
public class Perimeter {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].equals("Circle")){
                float x=Float.parseFloat(args[i+1]);
                Circle c1=new Circle(x);
                c1.periCircle();
            }
            else if(args[i].equals("Rectangle")){
                float x=Float.parseFloat(args[i+1]),y=Float.parseFloat(args[i+2]);
                Rectangle r1=new Rectangle(x,y);
                r1.PeriRectangle();
            }
            else if(args[i].equals("Square")){
                float x=Float.parseFloat(args[i+1]);
                Square s1=new Square(x);
                s1.PeriSquare();
            }
        }
    }
}

