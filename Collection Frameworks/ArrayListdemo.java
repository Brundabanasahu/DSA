import java.util.*;
public class ArrayListdemo {
    public static void main(String args[])
    {
        ArrayList l=new ArrayList<>();
        l.add("B");
        l.add("R");
        l.add(null);
        System.out.println(l);//[B,R,null]
        l.remove(2);
        System.out.println(l);//[B,R]
        l.add(2,"S");
        l.add("P");
        System.out.println(l);//[B,R,S,P]
    }
}