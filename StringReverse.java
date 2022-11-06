public class StringReverse {
    public static void main(String[] args) {
        String s="Hello";
        String Result="";
        for(int i=0;i<s.length();i++){
            Result=s.charAt(i)+Result;
        }
        System.out.println("Original String -->"+s);
        System.out.println("Reversed string -->"+Result);

    }
}
