package Trees.LeetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//Leetcode
public class ZigZagOrder {

    /*public List<List<Integer>> levelOrder(TreeNode, root){

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        boolean reverse = false;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize ; i++) {
                if(!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentlevel.add(currentNode.val);

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                }
                else{
                    TreeNode currentNode = queue.pollLast();
                    currentlevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }

                }
            }
            reverse = !reverse;
            result.add(currentlevel);
        }
        return result;
    }*/
}
