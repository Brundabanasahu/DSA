import java.util.*;
class PrintnameNtimes{

    public static void name(int n){
        if(n==0){
            return;
        }
        System.out.println("Bulbul");
        name(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        name(n);

    }
}