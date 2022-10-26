import java.util.Scanner;

public class Palindrome {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        number=sc.nextInt();
        int rev= reverseNumber(number,0);
        System.out.println(rev);
        if (rev==number)
            System.out.println("palindrome");
        else
            System.out.println("Not Paliindrome");
    }
    public static int reverseNumber(int n,int ans){
        if(n<=0)
            return ans;
        int r=n%10;
        ans=ans*10+r;
        return reverseNumber(n/10,ans);

    }
}
