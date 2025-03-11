public class _3ReverseArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArr(arr,0,arr.length-1);
        printArr(arr);
    }
    public static void reverseArr(int arr[],int i,int j){
        if(i>=j)
        return;
        swapNum(arr,i,j);
        reverseArr(arr, i+1, j-1);
    }
    public static void swapNum(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printArr(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
