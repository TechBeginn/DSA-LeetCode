/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        if(root == null){ return res; }

        q.add(root);
        int level=0; 
        while(!q.isEmpty()){
            List<Integer> l= new ArrayList<>();
            int size= q.size();
            for(int i=0; i<size; i++){
                TreeNode curr= q.poll();
                l.add(curr.val);
                if(curr.left != null){q.add(curr.left);}
                if(curr.right != null){q.add(curr.right);}
            }
            if(level%2==0){ res.add(l);}
            else{
                Collections.reverse(l);
                res.add(l);
            }
            level++;
        }
        return res;
    }
}