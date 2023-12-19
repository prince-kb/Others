package PackagesInJava;
import PackagesInJava.UnderstandingPackages.File1;

public class Package1 {
    //must be declared public to another file to access
    public void useMyPackage(){
        System.out.println("I am Package 1");
    }
        public void P4(){
            File1.main(null);
}
}
