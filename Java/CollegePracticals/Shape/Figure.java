package Shape;
public class Figure{
    public double calcVolume(int a){
        return a*a*a;
    }
    public double calcVolume(int a,int b){
        return (22*a*a*b)/7;
    }
    public double calcVolume(int a,int b,int c){
        return a*b*c;
    }
}