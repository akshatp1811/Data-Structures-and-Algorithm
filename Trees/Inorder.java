import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    List<Integer> list = new ArrayList<>(); 

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return list; 
        }

        inorderTraversal(root.left);      
        list.add(root.val);              
        inorderTraversal(root.right);     

        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);
        System.out.println(result);
    }
}