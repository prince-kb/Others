public class CitySort {
    public static void main(String[] args) {
        
        for(int i=0;i<args.length-1;i++){
            if(args[i].compareTo(args[i+1])>0){
                String temp=args[i];
                args[i]=args[i+1];
                args[i+1]=temp;
            }
        }

        display(args);

    }
    public static void display(String [] args){
        for(int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
        }
    }
}
