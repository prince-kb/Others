    //Classes are defined out of the main class

    class Employee{
        int id;
        String name;

        public Employee(){
            id=00000;
            name="NoName";
        }

        public Employee(int i){
            id=i;
            name="XXXXX";
        }
        public Employee(String a){
            id=000000;
            name=a;
        }
        public Employee(int a,String n){
            id=a;
            name=n;
        }

        void print(){
            System.out.println("Identity is : "+id);
            System.out.println("Name is : "+name);
        }
        void Walking(){
            System.out.println(name + " is walking");
        }
        void Talking(){
            System.out.println(name + " is talking");
        }
        void Baking(){
            System.out.println(name + " is baking");
        }

        
    }
public class Prince03{
public static void main(String[] args) {
    Employee Adil =new Employee();

    Adil.id=166709;
    Adil.name="Badi Sir";
    Adil.print();
    Adil.Talking();
    Adil.Walking();
    Adil.Baking();

    Employee underDog1=new Employee(199908, "Goat");
    Employee underDog2=new Employee(199908);
    Employee underDog3=new Employee("GlowBird");

    underDog1.print();
    underDog2.print();
    underDog3.print();
}

}