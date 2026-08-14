import java.util.*;


public class Add_Arr {
    public static void main(String[] args) {
        int[] arr1={9,9,9};
        int[] arr2={1};

        ArrayList<Integer> ll=new ArrayList<>();

        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            System.out.println(ll);
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            ll.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(j>=0){
            int sum=arr1[j]+carry;
            ll.add(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry>0){
            ll.add(carry);
        }

        Collections.reverse(ll);
        System.out.println(ll);
    }
}
