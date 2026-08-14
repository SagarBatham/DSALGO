
import java.util.Stack;

public class Building_Stack {
    public static void main(String[] args) {
        int[] building = { 3, 1, 6, 4, 17, 7, 5, 11, 19 };
        int[] ans = new int[building.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < building.length; i++) {
            int ele = building[i];
            while (!st.isEmpty() && ele >= building[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
