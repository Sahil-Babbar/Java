public class QuickSort {
    public static void main(String[] args) {
        int arr[]={2,3,1,11,7,8,4,10,6};

        int s=0;
        int e=arr.length-1;

        quickSort(arr,s,e);
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void quickSort(int arr[],int s,int e){
//        base case
        if(s>=e){
            return;
        }

        int pivtindex=partition(arr,s,e);
        quickSort(arr,s,pivtindex-1);
        quickSort(arr,pivtindex+1,e);
    }
    public static int partition(int arr[],int s,int e){
        int i=s-1;
        for(int j=s;j<e;j++){
            if(arr[j]<=arr[e]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
//        placing pivot element to correct pos...
        int temp=arr[i+1];
        arr[i+1]=arr[e];
        arr[e]=temp;
        return i;
    }
}