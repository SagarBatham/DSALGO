public class PascalTri {
    public static void main(String[] args) {
        int n=6;
        int i=0;
        int star=1;
        while(i<n){
            int j=0;
            int nCr=1;
            while(j<star){
            System.out.print(nCr+" ");
            nCr=nCr*(i-j)/(j+1);
            j++;
            }
            i++;
            star++;
            System.out.println();
    }
}
}
