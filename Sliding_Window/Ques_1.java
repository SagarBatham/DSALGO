// 713. Subarray Product Less Than K

public class Ques_1 {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k = 100;
        System.out.println(countSubSliding(arr, k));
    }

    public static int countSub(int[] arr, int k) {
        int win = 1;
        
        int count = 0;
        
        while (win <= arr.length) {
            int mul=1;
            for (int i = 0; i < win; i++) {
                mul *= arr[i];
                
            }
            if(mul<k){
                    count++;
                }
            for (int i = win; i < arr.length; i++) {
                mul *= arr[i];
                
                mul /= arr[i - win]; 
                if(mul<k){
                    count++;
                }
            }
            win++;
        }

        return count;
    }
    public static int countSubSliding(int[] arr, int k) {

    // if (k <= 1) return 0;

    int count = 0;
    int start = 0;
    int end = 0;
    int mul = 1;

    while (end < arr.length) {

        mul *= arr[end];

        while (mul >= k) {
            mul /= arr[start];
            start++;
        }

        count += (end - start + 1);

        end++;
    }

    return count;
}
}
