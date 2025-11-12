import java.util.Scanner;

public class CompletePyramid {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int n=sc.nextInt();

    //Upper Pyramid
     for(int i=0;i<n;i++)
        {

            //Space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            //Star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            
            //Space
              for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        //Lower Pyramid 
          for(int i=0;i<n;i++){

            //Space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }

            //Star
            for(int j=0;j<2*(n-i);j++)
            {
            System.out.print("*");
            }

            //Space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();

        }
        
   } 
}
