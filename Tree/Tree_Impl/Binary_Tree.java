
import java.util.Scanner;

public class Binary_Tree {
    public class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public Binary_Tree(){
        root=createTree();
    }
    Scanner sc=new Scanner(System.in);
    private Node createTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hln=sc.nextBoolean();
        if(hln){
            nn.left=createTree();
        }
        boolean hrn=sc.nextBoolean();
        if(hrn){
            nn.right=createTree();
        }
        return nn;
    }

    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node==null){
            return;
        }

        String s="";
        s="<--"+node.val+"-->";
        if(node.left!=null){
            s=node.left.val+s;
        }else{
            s="."+s;
        }

        if(node.right!=null){
            s=s+node.right.val;
        }else{
            s=s+".";
        }

        System.out.println(s);
        display(node.left);
        display(node.right);
    }
}
