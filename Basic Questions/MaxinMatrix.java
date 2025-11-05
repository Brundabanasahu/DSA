import java.util.Scanner;

public class MaxinMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the elemnt of the array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
            arr[i][j]=sc.nextInt();
        }
    }

    int max=arr[0][0];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    System.out.println("The maximum number in the matix is "+max);
    sc.close();
        
    }
}
