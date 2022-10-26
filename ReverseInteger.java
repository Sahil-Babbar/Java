import java.util.Scanner;

public class ReverseInteger {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        System.out.println(Reversenumber(n));
    }
    public static int Reversenumber(int n){
        int rev=0;
        while(n!=0){
            int r=n%10;
            n=n/10;
            if(rev<Integer.MIN_VALUE/10 || rev>Integer.MAX_VALUE/10){
                return 0;
            }
            rev=rev*10+r;
        }
        return  rev;
    }
}
