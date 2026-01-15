import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int originalnum=num;
        int sum=0;
        while(num>0){
            int lastdigit=num%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            num=num/10;
        }
        if(sum==originalnum){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not Amstrong number");
        }
    }   
}
