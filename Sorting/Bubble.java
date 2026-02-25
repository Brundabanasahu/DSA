
import java.util.Scanner;
public class Bubble {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        bubblesort(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    public static void bubblesort(int arr[]){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int didswap=0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }
}
    

//yaha pe maximum element ko aage push karna hota hai it is the opposite of selection sort
//Time complexity:O(n^2) for all the cases
//for optimal case the time complexity is O(n) because if the array is already sorted then there will be no swapping and the loop will break after the first iteration