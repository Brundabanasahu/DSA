import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        int sqrt=(int)Math.sqrt(num);
        if(sqrt*sqrt==num){
            System.out.println("Perfect square");
        }else{
            System.err.println("Not a perfect square");
        }
    sc.close();
    }

}
