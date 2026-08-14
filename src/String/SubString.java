public class SubString {
    public static void main(String[] args) {
        String a="nitin";

        // for (int i = 0; i < a.length(); i++) {
        //     for (int j = i; j < a.length(); j++) {
        //         for (int k = i; k <= j; k++) {
        //             System.out.print(a.charAt(k)+"");
        //         }
        //         System.out.println();
        //     }
            
        // }

        for (int i = 0; i < a.length(); i++) {
            for (int j = i+1; j <= a.length(); j++) {
                System.out.println(a.substring(i, j));
            }
            
        }
    }
}
