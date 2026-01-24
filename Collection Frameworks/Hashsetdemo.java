import java.util.*;
class Hashsetdemo{
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add("java");
        h.add("python");
        h.add("c++");
        h.add(null);
        h.add("kotlin");
        System.out.println(h.add("c"));
        System.out.println(h);
    }
}