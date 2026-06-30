public class LinkedList {
    public class Node{
        int val;
        Node next;
    }

    private Node head;
    private int size;
    private Node tail;

    public void addFirst(int item){
        Node nn =new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            if(temp.next==null){
                System.out.print("null");
            }
            
            temp=temp.next;
        }
        System.out.println();
    }

    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }else{
            Node nn=new Node();
            nn.val=item;
            tail.next=nn;
            tail=nn;
            nn.next=null;
        }
        size++;
    }

    public void addAtIndex(int item,int p) throws Exception{
        if(p==0){
            addFirst(item);
            return;
        }

        if(p==size){
            addLast(item);
            return;
        }

        if(p<0 || p>=size){
            throw new Exception("Invalid Position");
        }

        Node nd=getNode(p-1);
        Node nxnd=getNode(p);
        Node nn=new Node();
        nn.val=item;
        nd.next=nn;
        nn.next=nxnd;

        size++;
    }

    public int removeFirst(){
    int rv = head.val;
    head = head.next;

    if(size == 1){
        tail = null;
    }

    size--;
    return rv;
}

    public int removeLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        Node rv=tail;
        size--;
        return rv.val;
    }

    public int removeAtPos(int p) throws Exception {

    if(size == 0){
        throw new Exception("LL is empty");
    }

    if(p < 0 || p >= size){
        throw new Exception("Invalid Position");
    }

    if(p == 0){
        return removeFirst();
    }

    if(p == size - 1){
        return removeLast();
    }

    Node prev = getNode(p - 1);

    int rv = prev.next.val;

    prev.next = prev.next.next;

    size--;

    return rv;
}

    private Node getNode(int idx){
        Node temp=head;

        while(idx>0){
            temp=temp.next;
            idx--;
        }

        return temp;
    }

}
