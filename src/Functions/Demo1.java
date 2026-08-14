
public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Hey");
        int a=9;
        int b=7;
        int c=a+b;
        add(a,b);
        System.out.println(add(a, b));
        // sub(a,b);
        System.out.println("Main "+c);
        
    }

    public static int add(int a,int b){
        int c=a+b;
        // sub(a,b);
        // System.out.println("Add "+c);
        return c;
    }

    // public static void sub(int a,int b){
    //     int c=b-a;
    //     System.out.println("Sub "+c);
    // }
}
