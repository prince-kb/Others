
abstract class primeApe{
    abstract void bite();
    void eats(){
        System.out.println("We eat");
    }
}

class monkey extends primeApe{
    void bite(){
        System.out.println("We bite");
    }
    void jump(){
        System.out.println("We can jump");
    }
}
interface basicFunctionalites{
    void talk();
    void drive();
}
class human  extends monkey implements basicFunctionalites {
    void wear(){
        System.out.println("We wear");
    }
    public void talk(){
        System.out.println("We talk");
    }
    public void drive(){
        System.out.println("We drive");
    }
}
public class Practice01 {
    public static void main(String[] args) {

    human h1 = new human();
    h1.eats();
    h1.bite();
    h1.jump();
    h1.talk();
    h1.drive();

    System.out.println();

    //Runtime polymorphism
    monkey m1 = new human();
    m1.bite();


    }


}
