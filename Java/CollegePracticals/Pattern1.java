class Pattern1{
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        
        int [][] arr=new int[50][];
        for(int i=0;i<n;i++)
        arr[i]=new int [i+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((j%2)==0)
                    arr[i][j]=1;
                else arr[i][j]=0;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}