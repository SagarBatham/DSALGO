
import java.util.Stack;

// 316. Remove Duplicate Letters
public class Prob_316 {
    public static void main(String[] args) {
        String s="cbcabc";
        System.out.println(remDuplicate(s));
    }

    public static String remDuplicate(String s){
        int[] lstIndex=new int[26];

        for (int i = 0; i < s.length(); i++) {
            int idx=(int)s.charAt(i)-'a';
            lstIndex[idx]=i;
        }

        Stack<Character> st=new Stack<>();

        boolean[] isExist=new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            
            char stre=s.charAt(i);
            int idx=(int)s.charAt(i)-'a';

            if(isExist[idx]){
                continue;
            }

            while(st.size()>0 && st.peek()>s.charAt(i) && lstIndex[(int)st.peek()-'a']>i){
                isExist[(int)st.peek()-'a']=false;
                st.pop();
            }

            st.push(stre);
            isExist[idx]=true;
        }

        StringBuilder newstR=new StringBuilder();
        while(!st.isEmpty()){
            newstR.append(st.pop());
        }

        return newstR.reverse().toString();
    }
}
