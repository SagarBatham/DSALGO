public class Mat_2DPath {
    public static void main(String[] args) {
        int[][] path=new int[3][3];
        printPath(path, 0, 0, "");
        System.out.println(printPath(path, 0, 0, ""));
    }

    public static int printPath(int[][] path,int hor,int ver,String ans){
        if(hor==path.length-1 && ver==path[0].length-1){
            System.out.println(ans);
            return 1;
        }

        if(hor>path.length || ver>path[0].length){
            return 0;
        }
        int a=printPath(path, hor+1, ver, ans+"H ");
        int b=printPath(path, hor, ver+1, ans+"V ");
        return a+b;
    }
}
