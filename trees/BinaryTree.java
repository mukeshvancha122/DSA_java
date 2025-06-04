package trees;

public class BinaryTree {
      public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;

        }
        
      }

      public static void main(String[] args) {
        Node root=new Node(2);
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(6);
        Node d=new Node(5);
        Node e= new Node(11);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        printTree(root);
      }

      public static void printTree(Node node){
        if(node==null){
            return ;
        }
        System.out.print(node.val+ " -> ");
        if(node.left!=null){
            System.out.print(node.left.val + ", ");
            
        } 
        if(node.left==null){
            System.out.print("null ,");
        }
        if(node.left==null){
            System.out.print("null ");
        }
        

        if(node.left!=null){
            System.out.println(node.right.val);

        }
        System.out.println();
        
        
        printTree(node.left);
        printTree(node.right);
      }
}
