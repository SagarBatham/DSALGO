public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Hey");
        int a=9;
        int b=11;
        int i=2;
        int j=3;
        int c=a+b;
        add(a,b); 
        add(i,j);
        add(a,i);
        System.out.println(c);
    }
    public static void add(int a,int b){
        System.out.println(a);
        int c=a+b;
        System.out.println(c);
    }
}
