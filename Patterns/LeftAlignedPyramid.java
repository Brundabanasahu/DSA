import java.util.Scanner;

public class LeftAlignedPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  n=sc.nextInt();

        //Upper Part
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //lower Part
         for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
