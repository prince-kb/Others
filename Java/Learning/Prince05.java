import java.util.Scanner;

class scorecounter{

    int n;

    scorecounter(int n){
        this.n=n;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
}

public class Prince05 {

    public static void main(String[] args) {
        int x = (int)Math.floor(Math.random()*100);
        System.out.println(x);
        Scanner scan=new Scanner(System.in);
        int y;
        System.out.print("Enter number of rounds to play : ");
        y=scan.nextInt();
        scorecounter player1 =new scorecounter(y);

        while((player1.getN() >= 1)){
            System.out.print("Guess the number : ");
            int z=scan.nextInt();
            if(x==z){
                System.out.println("You scored "+player1.getN()+" out of "+y);
                break;
            }
            else if(z>x){
                System.out.println("Your guessed number is greater");
                player1.setN(player1.getN()-1);
            }
            else{
                System.out.println("Your guessed number is lesser");                
                player1.setN(player1.getN()-1);
            }
        }
                if(player1.getN() == 0){
                System.out.println("You lost");
            }
    }
}
