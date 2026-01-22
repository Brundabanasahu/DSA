import java.util.*;
class ListIteratordemo{
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Bulbul");
        l.add("Swarup");
        l.add("Chulbul");
        l.add("Raja");
        System.out.println(l);
        ListIterator itr=l.listIterator();
        while(itr.hasNext()){
            String s=(String)itr.next();
            if(s.equals("Bulbul")){
                itr.remove();
            }
            else if(s.equals("Raja")){
                itr.add("King");
            }
            else if(s.equals("Bulbul")){
                itr.set("Jyoti");
            }
        }
        System.out.println(l);
    }
}