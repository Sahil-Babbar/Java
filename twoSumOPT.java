import java.util.HashMap;
import java.util.Scanner;

public class twoSumOPT {
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
//        Calling two Sum Function
        int[] result= twoSumtarget(arr,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public  static int[] twoSumtarget(int[] arr,int t){
        HashMap<Integer,Integer>numbers=new HashMap<>();
        int[] result=new int[2];
        for (int i=0;i<arr.length;i++){
            if(numbers.containsKey(t-arr[i])){
                result[1]=i;
                result[0]=numbers.get(t-arr[i]);
                return  result;
            }
            numbers.put(arr[i],i);
        }
        return result;
    }
}
