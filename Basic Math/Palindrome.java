import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rev=0;
        int duplicate=n;
        while(n>0){
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
            
        }
        if(rev==duplicate){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
