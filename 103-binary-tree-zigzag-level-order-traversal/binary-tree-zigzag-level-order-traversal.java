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
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
        boolean rev = false;
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currRes= new ArrayList<>(levelSize);
            for (int i=0;i< levelSize; i++){

                if(!rev){
                    TreeNode currNode = queue.pollFirst();
                    currRes.add(currNode.val);
                    if(currNode.left != null){
                        queue.addLast(currNode.left);
                    }
                    if(currNode.right != null){
                        queue.addLast(currNode.right);
                    }
                }else {
                    TreeNode currNode = queue.pollLast();
                    currRes.add(currNode.val);
                    if(currNode.right != null){
                        queue.addFirst(currNode.right);
                    }
                    if(currNode.left != null){
                        queue.addFirst(currNode.left);
                    }
                }
            }
             rev = !rev;
             res.add(currRes);
        }
        return res;
    }
}