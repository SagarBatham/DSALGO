public class String_Subseq {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(print_subsequence(s, ""));
    }
    static int count=0;
    public static int print_subsequence(String s,String ans){
        if(s.length()==0){
            count++;
            System.out.println(ans);
            return 1;
        }

        String ch=s.substring(0,1);
        print_subsequence(s.substring(1), ans);
        print_subsequence(s.substring(1), ans+ch);

        return count;
    }
}
