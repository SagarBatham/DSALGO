
public class Str_Perm {
    public static void main(String[] args) {
        PermStr("aba", "");
    }

    public static void PermStr(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            boolean flag = false;
            char ch = ques.charAt(i);
            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                PermStr(ques.substring(0, i) + ques.substring(i + 1), ans + ch);

            }

        }
    }
}
