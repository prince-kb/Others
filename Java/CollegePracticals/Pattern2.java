public class Pattern2 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        char [][] arr=new char [50][];
        for(int i=0;i<n;i++){
            arr[i]=new char [i+1];
            for(int j=0;j<=i;j++)
                arr[i][j]='*';
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            System.out.print (arr[i][j]);
            System.out.println("");
        }
        
    }
}
