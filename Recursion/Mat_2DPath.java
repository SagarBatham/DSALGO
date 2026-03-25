public class Mat_2DPath {
    public static void main(String[] args) {
        int[][] path=new int[3][3];
        printPath(path, 0, 0, "");
    }

    public static void printPath(int[][] path,int hor,int ver,String ans){
        if(hor==path.length-1 && ver==path[0].length-1){
            System.out.println(ans);
            return;
        }

        if(hor>path.length || ver>path[0].length){
            return;
        }
        printPath(path, hor+1, ver, ans+"H ");
        printPath(path, hor, ver+1, ans+"V ");
    }
}
