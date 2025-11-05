import java.util.Scanner;

class first{
    public void Even(int[] arr){
        int counteven=0;
        int countodd=0;
        for(int num:arr){
        if(num%2==0){
            counteven++;
        }
        else{
            countodd++;
        }
    }
    System.out.println("the even number is "+counteven);
    System.out.println("the odd number is "+countodd);
    }
}

public class Countoddeven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the element in the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        first obj=new first();
        obj.Even(arr);
        sc.close();
    }
}