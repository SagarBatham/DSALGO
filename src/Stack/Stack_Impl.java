public class Stack_Impl {
    private int[] arr;
    private int top=-1;

    public Stack_Impl() {
        arr=new int[5];
    }

    public Stack_Impl(int n) {
        arr=new int[n];
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }

        return false;
    }

    public boolean isFull(){
        return top==arr.length-1;
    }

    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("Bklok Stack Full Hogya h");
        }
        top++;
        arr[top]=item;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int val=arr[top];
        top--;
        return val;
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int val=arr[top];
        return val;
    }

    public int size(){
        return top+1;
    }

    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
