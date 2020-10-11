package InternshipInterview.ByteDance;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal94 {
    List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {

    }

    //迭代
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }

    //递归
    public void recurse(TreeNode root) {
        if (root != null){
            recurse(root.left);
            res.add(root.val);
            recurse(root.right);
        }
    }
}
