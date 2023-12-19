import javax.sound.sampled.SourceDataLine;

//Classes are defined out of the main class
    class landAnimal{
        public void animalProperties(){
            System.out.println("I can eat");
            System.out.println("I can reproduce");
            System.out.println("I can move");
        }
    }

//Inheritance
//Class dog is inheriting the property landAnimal

    class dog extends landAnimal{

        String name;
        dog(String n){
            name=n;
        }
        public void dogProperties(){
            System.out.println("I am a dog");
            System.out.println("My name is "+name);
            System.out.println("I can guard");
        }
    }

public class Prince04 {

    public static void main(String[] args) {
        landAnimal all=new landAnimal();
        all.animalProperties();
        System.out.println();
        dog tommy=new dog("Tommy");
        tommy.animalProperties();
        tommy.dogProperties();
    }
}
