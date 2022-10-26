import java.util.Scanner;

public class BinarySearch {
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
        int ans=SearchElement(arr,0,n-1,target);
        if(ans!=-1)
            System.out.println("element found at index "+ans  );
        else
            System.out.println("Not found");
    }
    public static int SearchElement(int[]arr,int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=(s+e)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            return SearchElement(arr,mid+1,e,target);
        }
        else {
            return SearchElement(arr,s,mid-1,target);
        }

    }
}
