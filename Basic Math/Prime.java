import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        int count=0;
        for(int i=1;i*i<=number;i++)
        {
            if(number%i==0)
            {
                count++;
                if((number/i)!=i)
                    count++;
            }
        }
            if(count==2)
            {
                System.out.println("Prime Number");
            }
            else
            {
                System.out.println("Not a Prime Number");
        }
    }
}
