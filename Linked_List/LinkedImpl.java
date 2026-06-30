public class LinkedImpl extends Exception{
    public static void main(String[] args) throws Exception {
        LinkedList ll=new LinkedList();
        // ll.addFirst(5);
        // ll.display();
        // ll.addFirst(6);
        // ll.display();
        
        ll.addLast(3);
        ll.display();
        ll.addLast(4);
        ll.display();
        ll.addLast(5);
        ll.display();
        ll.addFirst(7);
        ll.display();
        ll.addFirst(8);
        ll.display();
        ll.removeFirst();
        ll.display();
        ll.removeLast();
        ll.display();
        ll.removeAtPos(2);
        ll.display();
        ll.addAtIndex(4, 0);
        ll.display();
        ll.addAtIndex(5, 2);
        ll.display();
        ll.addAtIndex(9, 4);
        ll.display();
        ll.addAtIndex(999, 2);
        ll.display();
        System.out.println(ll.removeAtPos(2));
        ll.display();
        
    }
}
