package toDos;

public class TreeNode {

    int value;
    TreeNode[] neighbors;

    // no children no parent constructor
    TreeNode(){
        this.neighbors = null;
    }
    // children is passed
    TreeNode(TreeNode[] neighbors){
        this.neighbors = neighbors;
    }

}
