import java.util.*;

public class threeSum {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]nums=new int[6];
        for(int i=0;i< nums.length;i++){
           nums[i]= sc.nextInt();
        }cdc
        int n=nums.length;
        //Set<>result=new HashSet<>();
        Set<List<Integer>>result=new HashSet<>();
        for(int i=0;i<n;i++){
            if(i>0){
                if(nums[i]==nums[i-1])
                    continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right){
                List<Integer>list=new ArrayList<>();
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else{
                    list.add(i);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    int temp = nums[left];
                    while(left < right && nums[left] == temp)
                        left++;
                    int t2=nums[right ];
                    while(left < right && nums[right] == t2)
                        right--;
                    System.out.println(list);
                }

            }
        }
        System.out.println(result);
    }
}
