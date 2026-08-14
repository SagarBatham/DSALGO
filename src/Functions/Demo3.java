
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Hey");
        int a=9;
        int b=7;
        int c=a+b;
        add(a,b);
        System.out.println("Func "+add(a, b));
        // sub(a,b);
        System.out.println("Main "+c);
        System.out.println(sub(a, b));
        
    }

    public static int add(int a,int b){
        int c=a+b;
        sub(a,b);
        System.out.println("Add "+c);
        return c;
    }

    public static int sub(int a,int b){
       return b-a;
    }
}
