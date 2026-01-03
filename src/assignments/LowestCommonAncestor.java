package assignments;

class Node {
    int data;
    Node left;
    Node right;
    Node(int x) { this.data = x;}
}

public class LowestCommonAncestor {
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if(root == null || root.data == v1 || root.data == v2){
            return root;
        }

        Node leftAnc = lca(root.left,v1,v2);
        Node rightAnc = lca(root.right,v1,v2);

        if(leftAnc == null){
            return rightAnc;
        }else if(rightAnc == null){
            return leftAnc;
        }
        return root;
    }
}
