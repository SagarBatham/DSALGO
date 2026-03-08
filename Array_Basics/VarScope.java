public class VarScope {
    public static void main(String[] args) {
        System.out.println("Hey");
        int x=64;
        System.out.println(val);
        fun(x);
        System.out.println("Main "+val);
    }
    public static int val=100;
    //static int b=5;
    public static void fun(int x){
        //int a=90;
        System.out.println(x);
        val=120;
        System.out.println(val);
        VarScope.val=45;
        System.out.println(val)
    }
}
