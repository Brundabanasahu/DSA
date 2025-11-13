import java.util.Scanner;

public class LeftAlignedcharInversePyramid {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char ch=(char)('A'+i);
            for(int j=0;j<=n-i-1;j++)
            {
                System.out.print(ch);
               
            }
            System.out.println();
        }
    }
}
