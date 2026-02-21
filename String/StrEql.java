public class StrEql {
    public static void main(String[] args) {
        String a="Hello";
        String b="Helloo";
        System.out.println(equals(a, b));
    }
    public static boolean equals(String str1,String str2){
        if(str1==str2){
            return true;
        }
        if(str1.length()!=str2.length()){
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }

        return false;
    }
}
