public class Head_Tail {
    public static void main(String[] args) {
        printAllPos(3, "");
    }

    public static void printAllPos(int n,String s){
        if(n==0){
            System.out.println(s+" ");
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)!='H'){
            
        printAllPos(n-1, s+'H');
        }
        printAllPos(n-1, s+'T');
    }
}
