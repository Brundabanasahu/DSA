import java.util.Scanner;

class Countdigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        System.out.println(count(n));
    }
    static int count(int n){
        int count=0;
        while(n>0){
            int lastdigit=n%10;
            count=count+1;
            n=n/10;
        }
        return count;
    }
}