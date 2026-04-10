import java.util.*;
public class SecondEle {

    public static int Largest(int arr[],int n){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

    public static int SecondSmallest(int arr[],int n){
        int smallest=arr[0];
        int ssmallest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of array:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int secondlargest=Largest(arr,n);
    int secondsmallest=SecondSmallest(arr,n);

    System.out.println("Second Largest: " + secondlargest);
    System.out.println("Second Smallest: " + secondsmallest);
}
}
