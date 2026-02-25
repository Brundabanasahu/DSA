
import java.util.Scanner;
public class Selection{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }

    }
}
//Time comlexity:O(n^2) for all the cases
//yaha pe smallest element ko aage push karna hota hai