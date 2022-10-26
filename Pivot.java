class Pivot{
    public static void main(String args[]){
        int arr[]={1,7,3,6,5,6};
        for(int i=0;i<arr.length;i++){
            int leftans=0;
            for(int j=0;j<i;j++){
                leftans+=arr[j];
            }
            int rightans=0;
            for(int j=i+1;j<arr.length;j++){
                rightans+=arr[j];
            }
            if(leftans==rightans){
                System.out.println(i);
                break;
            }
        }
    }
}