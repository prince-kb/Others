class Palindrome{
    public static void main(String[] args) {
        boolean a =true;
        int n=args[0].length();
        for(int i=0;i<n/2;i++){
            if(args[0].charAt(i)!=args[0].charAt(n-i-1)){
                a=false;
            }
        }
        if(a==false){
            System.out.println(args[0]+" is not palindrome");
        }
        else System.out.println(args[0]+" is palindrome");
    }
}