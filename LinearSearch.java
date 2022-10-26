import java.util.Scanner;

public class LinearSearch {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the Elements");
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number");
        int target=sc.nextInt();
        int ans=SearchElement(arr,n-1,target);
        if(ans!=-1)
            System.out.println("Element found at index "+ans);
        else
            System.out.println("Not found");
    }
    public static int SearchElement(int arr[],int n,int t){
        if(arr[n]==t){
            return n;
        }
        if(n==0)
            return -1;
        int ans=SearchElement(arr,n-1,t);
        return  ans;
    }
}
