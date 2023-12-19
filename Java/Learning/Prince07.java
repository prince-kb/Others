
   //Any abstract method in a class will make the whole class as an abstract class
   
   //If a class has any abstract method then the declaration of class name should be abstract also

   //We cannot make object of abstract classes
   abstract class fourWheelers{
        int tireSize=20;

        fourWheelers(int t){
            this.tireSize=t;
        }
         void horn(){
            System.out.println("Pee Pee");
         }

         void tireSizeGetter(){
            System.out.println("TireSize= "+tireSize);
         }

         //Only the next line is making the whole class as an abstract class
         abstract void seatingCapacity();
    }

    class jeep extends fourWheelers{

        int t;

        jeep(int t){
            super(t);
            System.out.println("I have seating capacity of "+t);
        }

        //Finishing an abstract method from abstract class
        @Override
        void seatingCapacity(){
            System.out.println("I have a seating capacity of "+t/4 + " person");
        }


    }

    abstract class flyingCar extends fourWheelers{
        flyingCar(int t){
            super(30);
        }

        int thrust;

        abstract void thrustGetter();
    }

    class thinTyre{
        thinTyre(){
            System.out.println("Thin Tyre called");
        }
        public void tyrePressure(){
            System.out.println("TyrePressure low");
        }
    }
    //An interface may not be declared abstract 
    //An interface is not a class as it can have undefined methods
    interface twoWheelers{
        //final keyword may not be used as it is already final by declaring in interface
        int x=20;
        // Abstract methods in interface may also be declared in interfaces
        abstract void batteryCapacity();
        void maxSpeed();

        //We can also define a default method for if we do not want to define this method in all the subclasses
        //This will not work as the tyrePressure method is not defined in the implementing class ie atlas
        // void tyrePressure();

        //Adding default will let the subclass implement the method without defining it
        //Also we can override the function in its implementing subclass
        default void tyrePressure(){
            System.out.println("TyrePressure normal");
        }
    }

    //Class cannot implement an interface but interface can extend another interference
    interface rangerCycle extends twoWheelers{

    }
    class atlas extends thinTyre implements twoWheelers {

        // class implementing interface class should must be declared public
        public void batteryCapacity(){
            System.out.println("Battery capacity = 1000mAh");
        }
        public void maxSpeed(){
            System.out.println("Max Speed = "+"20");
        }
        public void tyrepressure(){
            System.out.println("TyrePressure out of range");
        }
    }
public class Prince07 {
    public static void main(String[] args) {
        jeep j1=new jeep(26);j1.tireSizeGetter();
        atlas a1=new atlas();

        //Cannot be initiated because it is an abstract class
        // flyingCar f1=new flyingCar(10);
        
        
        //Cannot be initiated because it is an interface class and methods are not defined
        // twoWheelers t1=new twoWheelers();
        a1.maxSpeed();
        a1.tyrePressure();
    }
}
