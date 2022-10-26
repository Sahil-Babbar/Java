import java.util.Scanner;
public class TwoSum {
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
//        Calling two Sum Function
        twoSum(arr,target);
    }
    public static void twoSum(int[]arr,int target){
        int flag=0;
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    flag=1;
                    System.out.println(arr[i]+" , "+arr[j]);
                    break;
                }
                if(flag==1)
                    break;
            }
        }
    }
}