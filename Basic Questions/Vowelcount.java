import java.util.Scanner;

class Vowelcounter{
    public int countVowel(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'){
                count++;
            }
        }
        return count;
    }
}
public class Vowelcount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();

        Vowelcounter obj=new Vowelcounter();
        int Vowelcount=obj.countVowel(s);

        System.out.println("The total vowels are present is "+Vowelcount);

        sc.close();
    }
}
