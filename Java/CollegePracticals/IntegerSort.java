public class IntegerSort {
    public static void main(String[] args) {
        int arr [] = new int[args.length];
        int n=args.length;
        for(int i=0;i<n;i++)
        arr[i]=Integer.parseInt(args[i]);

        bubblesort(arr);
        display(arr);
    }

public static void bubblesort(int [] arr){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
public static void display(int [] arr){
    for(int i:arr)
        System.out.print(i+" ");
}
}