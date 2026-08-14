public class String_Permutation {
    public static void main(String[] args) {
        String s="abc";
        printStrPerm(s, "abc", "");
    }

    public static void printStrPerm(String s,String ques,String ans){
        if(ans.length()==s.length()){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            printStrPerm(s,ques.substring(0,i)+ques.substring(i+1), ans+s.charAt(i));
        }
    }
}
