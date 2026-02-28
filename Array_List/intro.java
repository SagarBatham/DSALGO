import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        System.out.println(ll);
        System.out.println(ll.size());

        ll.add(3);
        ll.add(4);
        ll.add(2);
        System.out.println(ll);
        System.out.println(ll.size());

        ll.add(2, 7);
        System.out.println(ll);
        ll.set(2, 5);
        System.out.println(ll);
        
        System.out.println(ll.get(2));
    }
}
