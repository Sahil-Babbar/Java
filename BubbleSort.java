import java.util.*;
class BubbleSort{
    private static Scanner sc=new Scanner(System.in);
    public static void main(String Args[]){
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        bubbleAlgo(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void bubbleAlgo(int[] arr,int n){
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
}