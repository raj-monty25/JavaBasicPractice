package Practice.gfg_potd;



//*node class of the binary ssearch tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}


/**
 * Given a Binary Search Tree with n nodes, find the sum of all leaf nodes.
 * BST has the following property (duplicate nodes are possible):
 *
 * The left subtree of a node contains only nodes with keys less than the node’s key.
 * The right subtree of a node contains only nodes with keys greater than or equal to the node’s key.
 * Your task is to determine the total sum of the values of the leaf nodes.
 *
 * Note: Input array arr doesn't represent the actual BST, it represents the order in which
 * the elements will be added into the BST.
 *
 * Example 1:
 * Input:
 * n = 6
 * arr = {67, 34, 82, 12, 45, 78}
 * Output:
 * 135
 *
 */
public class BSTSumOfLeafNode {

    public static int sumOfLeafNodes(Node root)
    {
        // code here
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return root.data;
        }

        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }

}
