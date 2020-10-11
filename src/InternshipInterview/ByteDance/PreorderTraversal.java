package InternshipInterview.ByteDance;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {

    }
    //迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node;
        while (!stack.isEmpty()){
            node = stack.pop();
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
            res.add(node.val);
        }

        return res;
    }
    //递归
    public void recurse(TreeNode root) {
        if (root != null){
            res.add(root.val);
            recurse(root.left);
            recurse(root.right);
        }
    }
}
