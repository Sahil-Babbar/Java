import java.util.Scanner;
class MergeSort{
    private  static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];
        for (int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        mergeArr(arr,0,n-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeArr(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
        int[] b=new int[1000];
        int[] c=new int[1000];
        int mid=(s+e)/2;
        for(int i=0;i<=mid;i++){
            b[i]=arr[i];
        }
        for(int i=mid+1;i<=e;i++){
            c[i]=arr[i];
        }
        //2. Sort
        mergeArr(b,s,mid);
        mergeArr(c,mid+1,e);
        // 3. Merge
        merge(arr,b,c,s,e);
    }
    public static void merge(int[]arr,int[] b,int[] c,int s,int e){
        int i=s;
        int mid=(s+e)/2;
        int j=mid+1;
        int k=s;
        while(i<=mid && j<=e){
            if(b[i]<c[j]){
                arr[k++]=b[i++];
            }
            else{
                arr[k++]=c[j++];
            }
        }
        while(i<=mid){
            arr[k++]=b[i++];
        }
        while(j<=e){
            arr[k++]=c[j++];
        }
    }
}