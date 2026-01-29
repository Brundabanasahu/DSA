import java.util.Scanner;

public class sumofNnumber {
    public static void sumof(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumof(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        sumof(n,0);
    }
}

