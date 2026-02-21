public class CompareStr {
    public static void main(String[] args) {
        String s1="kamal";
        String s2="komal";
        System.out.println(toCopmare(s1, s2));
 }
    public static int toCopmare(String s1,String s2){
        if(s1==s2){
            return 0;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);
            }
        }

        return s1.length()-s2.length();
    }
}
