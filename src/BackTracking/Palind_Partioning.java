import java.util.*;

public class Palind_Partioning {
    public static void main(String[] args) {
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        String s="abc";
        generatePartition(s,ll,ans);
        
    }
    public static void generatePartition(String s,List<String> ll,List<List<String>> ans){

        if(s.length()==0){
            System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=1;i<=s.length();i++){
            String ch=s.substring(0,i);
            ll.add(ch);
            generatePartition(s.substring(i),ll,ans);
            ll.remove(ll.size()-1);
        }
    }
}
