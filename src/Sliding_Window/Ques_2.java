public class Ques_2 {
    public static void main(String[] args) {
        String s="aabaabaabab";
        int k=2;
        System.out.println(perfStr(s, k));
    }
    public static int perfStr(String s,int k){
        int start=0;
        int end=0;
        int flag=0;
        int ans=1;
        char a='b';
        while(end<s.length()){
            if(s.charAt(end)==a){
                flag++;
            }
            while(flag>k && start<=end){
                if(s.charAt(start)==a){
                    flag--;
                }  
                start++;      
            }
            ans=Math.max((end-start+1), ans);
            end++;
        }

        return ans;
    }
}
