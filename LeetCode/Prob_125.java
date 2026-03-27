public class Prob_125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        if(isPalindrome(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                sb.append(ch);
            }else if(ch>='A' && ch<='Z'){
                sb.append((char)(ch-'A'+'a'));
            }else if(ch>='0' && ch<='9'){
                sb.append(ch);
            }

        }

        int start=0;
        int end=sb.length()-1;

        while(start<end){
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    //Another Approach
    /*
    class Solution {
    public boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            // skip special characters
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }

            // compare characters
            if (Character.toLowerCase(str.charAt(i)) != 
                Character.toLowerCase(str.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
} */
}
