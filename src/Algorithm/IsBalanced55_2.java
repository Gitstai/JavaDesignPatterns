package Algorithm;

public class IsBalanced55_2 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {

        //方法1：复杂度高
//        if (root == null) {
//             return true;
//        }
//        return ( Math.abs(height(root.right) - height(root.left)) <= 1 ) && isBalanced(root.left) && isBalanced(root.right);


        //方法2：复杂度低
        return console(root) != -1;
    }

    public int height(TreeNode root) {
        if (root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }


    public int console (TreeNode root){
        if (root == null) return 0;
        int left = console(root.left);
        if (left == -1) return -1;
        int right = console(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) <= 1 ? Math.max(left, right) + 1 : -1;
    }
}
