package Algorithm;

public class MaxDepth55_1 {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
