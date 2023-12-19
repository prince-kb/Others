class rectangle{

    rectangle(int l,int w){
        System.out.println("rectangle constructor called");
        this.length=l;
        this.width=w;
    }
    void sound(){
        System.out.println("You can access base");
    }
    int length,width;
    
    int getArea(){
        return length*width;
    }
    
    int getPara(){
        return 2*(length + width);
    }
    void getAll(){
        System.out.println("Area = "+getArea());
        System.out.println("Parameter = "+getPara());
        System.out.println();
    }
}

class cuboid extends rectangle{
    int height;
    cuboid(int l,int w,int h){
        super(l, w);
        System.out.println("Cuboid constructor called");
        this.height=h;

    }
    void smell(){
        System.out.println("You can access derived class by runtime polymorphism");
    }
    int getPara(){
        return 4*(length + width + height);
    }
    int getArea(){
        return 2*(length*width + width*height + length*height);
    }
    int getVolume(){
        return length*width*height;
    }
    void getall(){
        System.out.println("Volume = "+getVolume());
        System.out.println("Area = "+getArea());
        System.out.println("Parameter = "+getPara());
        System.out.println();
    }
}

public class Prince06 {
public static void main(String[] args) {
    rectangle r1=new rectangle(10,15);
    r1.getAll();

    cuboid c1=new cuboid(10,15,20);
    c1.getAll();

    //Dynamic method dispatch
    //Superclass can be made using the subclass.
    //During the runtime, the allocation is done so called runtime polymorphism
    rectangle c2=new cuboid(11, 25,35);

    //Cannot access derived class in dynamic method dispatch
    // c2.smell();

    //Can only access derived class objects
    c2.sound();
}
}
