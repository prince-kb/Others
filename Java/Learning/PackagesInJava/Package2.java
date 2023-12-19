package PackagesInJava;
public class Package2 {
    //must be declared public to another file to access
    public void useMyPackage(){
        System.out.println("I am package 2");
    }
    public static class P3{
        public void useMyPackage2(){
        System.out.println("I am extended class from package 2");
    }
    }

    }