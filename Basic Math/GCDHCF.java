import java.util.Scanner;

public class GCDHCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1%num2;
            }
            else{
                num2=num2%num1;
            }
            if(num1==0){
                System.out.println("GCD is: "+num2);
            }
            else if(num2==0){
                System.out.println("GCD is: "+num1);
            }
        }
    }
    
}
//i solve this problem using ecuclidean algorithm
//their formula or logic is : GCD(a,b)=GCD(a-b,b) keep doing the apply ecucliean algorithm untill one of them is zero.
