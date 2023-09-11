package toDos;

import java.util.ArrayList;

public class BFS {
     static public ArrayList<int>iterativeBFS (TreeNode root) throws Exception {
         ArrayList<int> result = new ArrayList<int>();
         ArrayList<TreeNode> visited = new ArrayList<TreeNode>();
         MyQueue queue = new MyQueue();
         visited.add(root);
         result.add(root.value);
         queue.push(root);
         while (!queue.isEmpty()){
            TreeNode exploring = (TreeNode) queue.pop();
            result.add(exploring.value);
            for (TreeNode neighbor: exploring.neighbors) {
                 if (!visited.contains(neighbor)){
                     visited.add(neighbor);
                     queue.push(neighbor);
                     result.add(neighbor.value);
                 }
             }
         }
         return result;
     }

     public static void main(String[] args) {

     }
}
