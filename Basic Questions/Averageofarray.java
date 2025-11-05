import java.util.Scanner;

class Second {
    public double Avg(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return (double) sum/n;

    }
    
}

public class Averageofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("enter the element in the array");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;


        Second obj=new Second();
        double avg=obj.Avg(arr,n);
        

        System.out.println(avg);
        sc.close();
    }
    
}
