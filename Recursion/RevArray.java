import java.util.Scanner;

public class RevArray {
    public static void rev(int left,int right,int arr[]){
        if(left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        rev(left+1,right-1,arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev(0,n-1,arr);
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
