
import java.util.ArrayList;
import java.util.List;

// 17. Letter Combinations of a Phone Number
public class Prob_17 {
    public static void main(String[] args) {
        String[] press = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String digits = "23";
        List<String> ll=new ArrayList<>();
        printAllPoss(ll,press, digits, "");
        System.out.println(ll);
    }

    public static void printAllPoss(List<String> ll,String[] press, String digits, String ans) {
        if (digits.length() == 0) {
            ll.add(ans);
            return;
        }

        char ch = digits.charAt(0);
        int idx = (int) (ch - '0');

        for (int j = 0; j < press[idx].length(); j++) {
            printAllPoss(ll,press, digits.substring(1), ans + press[idx].charAt(j));

        }

    }
}
