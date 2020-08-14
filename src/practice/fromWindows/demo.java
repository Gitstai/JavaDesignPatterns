package practice.fromWindows;

//节点类

public class demo {
    /*1.找到t的根节点在s中的位置
     * 2.判断两颗二叉树是否相同
     * */
    public boolean isSubtree(TreeNode s, TreeNode t){
        boolean flag = false;
        //递归的出口条件
        if(s != null){
            if(s.val == t.val){
                flag = panSon(s,t);
            }
            //此时s还未遍历完，仍未找到s中为t的根节点的值的节点
            //递归的从子树中寻找
            if(!flag){
                flag = isSubtree(s.left,t) || isSubtree(s.right,t);
            }
        }
        return flag;
    }
    public static boolean pan(TreeNode A, TreeNode B){

        if (A == null || B == null){
            return false;
        }
        boolean flag = false;

        if (A.val == B.val){
            flag = panSon(A,B);
        }
        if (!flag){
            flag = pan(A,B.left) || pan(A,B.right);
        }
        return flag;
    }
    public static boolean panSon(TreeNode A, TreeNode B){
        if (A == null && B == null){
            return true;
        }
        if (A == null || B == null || A.val != B.val){
            return false;
        }
        return panSon(A.left,B.left) && panSon(A.right,B.right);
    }

}