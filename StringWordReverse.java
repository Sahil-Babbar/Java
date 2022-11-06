public class StringWordReverse {
    public static void main(String[] args) {
        String s="Hello World";
        rev(s);
    }
    static void rev(String str) {
        String[] stra =str.split(" ");//split the string and save in array

        for(int i=0;i< (stra.length+1)/2;i++){
            String temp=stra[i];
            stra[i]=stra[stra.length-i-1];
            stra[stra.length-i-1]=temp;
        }
        System.out.println(String.join(" ",stra));
    }
}
