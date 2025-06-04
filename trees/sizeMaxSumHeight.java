package trees;

public class sizeMaxSumHeight {
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
         Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e= new Node(6);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;
        System.out.println("PREORDER TRAVERSAl");
        preorder(root);
        System.out.println("Size of the tree: "+size(root) );
        System.out.println("Sum of elements: "+ sumOfNodes(root));
    
    }
    public static int size(Node root){
        if(root==null){
            return 0;
        }
        int size=1+size(root.left)+size(root.right);
        return size;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int sum=root.val+sumOfNodes(root.left)+sumOfNodes(root.right);
        return sum;

    }
  

      public static void preorder(Node root){
       
        if(root==null){return;}
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
      }
}
