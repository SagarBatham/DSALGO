public class Target_ques {
    public static void main(String[] args) {
        targetFind(4,0, "");
    }

    public static void targetFind(int n,int sum,String s){
        if(sum==n){
            System.out.println(s);
            return;
        }
        if(sum>n){
            return;
        }

        // targetFind(n,sum+1, s+1);
        // targetFind(n,sum+2, s+2);
        // targetFind(n,sum+3, s+3);

        for (int i = 1; i <= 3; i++) {
            targetFind(n, sum+i, s+i);
        }
    }
}
