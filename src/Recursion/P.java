public class P {
    public static void main(String[] args) {
        String a="abc";
        generatePer(a,"");
    }
    public static void generatePer(String a,String ans){
        if(a.length()==0){
            System.out.println(ans);
            return;
        }

        for (int idx = 0; idx < a.length(); idx++) {
            char ch=a.charAt(idx);
            String rem=a.substring(0, idx)+a.substring(idx+1);
            generatePer(rem, ans+ch);
        }
    }
}
