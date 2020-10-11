package InternshipInterview.ByteDance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PostorderTraversal {
    List<Integer> res = new ArrayList<>();
    public static void main(String[] args) {

    }
    //迭代
    public static List<Integer> postorderTraversal (TreeNode root){
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null){
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        TreeNode node;
        while (!stack.isEmpty()){
            node = stack.pollLast();
            if (node.left != null){
                stack.addLast(node.left);
            }
            if (node.right != null){
                stack.addLast(node.right);
            }
            res.addFirst(node.val);
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
