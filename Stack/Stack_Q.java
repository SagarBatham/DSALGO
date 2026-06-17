public class Stack_Q {
    public static void main(String[] args) throws Exception{
        Stack_Impl st=new Stack_Impl();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        System.out.println(st.isFull());
        st.push(60);
        
        st.display();
       
        System.out.println(st.size());
    }
}
