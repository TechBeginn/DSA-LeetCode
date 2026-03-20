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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        // Same map logic: column → level → nodes
        TreeMap<Integer, TreeMap<Integer, LinkedList<Integer>>> map = new TreeMap<>();
        
        // Queue for BFS — stores [node, column, level]
        Queue<int[]> queue = new LinkedList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        
        nodeQueue.offer(root);
        queue.offer(new int[]{0, 0}); // column=0, level=0
        
        while (!nodeQueue.isEmpty()) {
            TreeNode curr = nodeQueue.poll();
            int[] pos = queue.poll();
            int col = pos[0], lvl = pos[1];
            
            // Fill map
            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(lvl, new LinkedList<>());
            map.get(col).get(lvl).add(curr.val);
            
            // Left → col-1, level+1
            if (curr.left != null) {
                nodeQueue.offer(curr.left);
                queue.offer(new int[]{col - 1, lvl + 1});
            }
            
            // Right → col+1, level+1
            if (curr.right != null) {
                nodeQueue.offer(curr.right);
                queue.offer(new int[]{col + 1, lvl + 1});
            }
        }
        
        // Build result List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        
        for (TreeMap<Integer, LinkedList<Integer>> levels : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (LinkedList<Integer> nodes : levels.values()) {
                // Sort nodes at same column & same level
                Collections.sort(nodes);
                colList.addAll(nodes);
            }
            result.add(colList);
        }
        
        return result;
    }
}