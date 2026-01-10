import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("Bulbul");
        l1.add(28);
        l1.add(null);
        l1.add("Bulbul");
        l1.set(0,"Sahu");
        l1.add(0,"Chulbul");
        l1.removeLast();
        l1.addFirst("Swaroop");
        System.out.println(l1); //[Swaroop, Chulbul, Sahu, 28, null]
        

    }
}
