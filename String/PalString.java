public class PalString {
    public static void main(String[] args) {
        String a="racecar";
        if(isPalindrome(a)){
            System.out.println("String Is Palondrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
    public static boolean isPalindrome(String s1){
        int i=0;
        int j=s1.length()-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
