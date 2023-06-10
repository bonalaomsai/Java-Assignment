/*Given the root of a binary tree, invert the tree, and return its root.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val) {
        this.val = val;
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Swap the left and right child of the current node
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
    
    // Helper method to print the binary tree (in-order traversal)
    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        InvertBinaryTree solution = new InvertBinaryTree();
        
        System.out.println("Original Tree:");
        solution.printTree(root);
        
        TreeNode invertedRoot = solution.invertTree(root);
        
        System.out.println("\nInverted Tree:");
        solution.printTree(invertedRoot);
    }
}
