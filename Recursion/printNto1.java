public class printNto1 {
    public static void num(int n)
    {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        num(n - 1);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();   
        num(n);
    }
}
