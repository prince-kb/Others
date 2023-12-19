
class PrintArray{
    static void print(int arr[],int n){
    System.out.println();
    for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    System.out.println();
    }
}
class Sort{
    static void bubbleSort(int [] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
    }}}}

    static void selectionSort(int [] arr,int n){
        for(int i=0;i<n;i++){
            int a = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[a]){
                    a=j;
                } }
            int temp = arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }}

    static void insertionSort(int [] arr,int n){
        int i=0;
        while(i<n-1){
            int j=n-1-i;
            while(j>=0 && arr[j]>arr[j+1]){
                arr[j]=arr[j+1];
                j--;
            }
            int temp=arr[n-1-i];
            arr[n-1-i]=arr[j+1];
            arr[j+1]=temp;
            i++;
        }}

        
        static void merge(int [] arr,int l,int m,int h){
            int n1=m-l+1,n2=h-m;
            int arr1[]=new int[n1],arr2 [] = new int[n2];
            int i=0,j=0,k=l;
            for(i=0;i<n1;i++){
                arr1[i]=arr[l+i];
            }
            for(j=0;j<n2;j++){
                arr2[j]=arr[m+j+1];
            }
            i=0;j=0;k=l;
            while(i<n1 && j<n2){
                if(arr1[i]<arr2[j]){
                    arr[k++]=arr1[i++];
                }
                else arr[k++]=arr2[j++];
            }
            while(i<n1){
                arr[k++]=arr1[i++];
            }
            while(j<n2){
                arr[k++]=arr2[j++];
            }

        }
    static void mergeSort(int [] arr,int l,int h){
        if(l<h){
            int m=(h+l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, h);
            merge(arr,l,m,h);
        }}
        
    static int quicky(int [] arr,int l,int h){
        int i=l,j=h,k=arr[l];
        while(i<j){
            do{i++;}
            while(arr[i]<k);
            do{j--;}
            while(arr[j]>k);
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }

    static void quickSort(int [] arr,int l,int h){
        if(l<h){
            int m=quicky(arr,l,h);
            quickSort(arr, l, m);
            quickSort(arr, m+1, h);
        }
    }


    }
class Sorting{
    public static void main(String[] args) {
        int arr [] = {2,6,89,0,-2,61,7,-5,23,8};
        int n=10;
        PrintArray.print(arr, n);

        // Sort.bubbleSort(arr, n);
        // Sort.selectionSort(arr,n);
        // Sort.selectionSort(arr, n);
        
        //Showing Error
        // Sort.mergeSort(arr, 0, n);
        // Sort.quickSort(arr,0,n);

        PrintArray.print(arr, n);

    }
}