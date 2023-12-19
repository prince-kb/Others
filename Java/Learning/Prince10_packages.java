import PackagesInJava.Package1;
import PackagesInJava.Package2;
public class Prince10_packages {
    public static void main(String[] args) {
        Package1 p1 = new Package1();
        Package2 p2 = new Package2();
        
        //To use another package, the method must be declared public in the package
        p1.useMyPackage();
        p2.useMyPackage();
        
    }
}
