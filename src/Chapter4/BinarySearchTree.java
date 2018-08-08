package Chapter4;

public class BinarySearchTree {

    TreeNode<Integer> root;

    public BinarySearchTree() { }

    public BinarySearchTree(int value) {
        root = new TreeNode(value);
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    private TreeNode insert(int data, TreeNode<Integer> node){

        if(node == null) {
            return new TreeNode<Integer>(data);
        } else if(data < node.data) {
            node.left = insert(data, node.left);
        } else {
            node.right = insert(data, node.right);
        }

        return node;
    }

    public void delete(int data) {

        root = delete(data, root);

    }

    private TreeNode<Integer> delete(int data, TreeNode<Integer> node) {

        if(node == null)
            return null;

        if(data < node.data)
            node.left = delete(data, node.left);
        else if(data > node.data)
            node.right = delete(data, node.right);

        else {

            if(node.left == null)
                return node.right;
            else if(node.right == null)
                return node.left;

            node.data = minValue(node.right);

            node.right = delete(node.data, node.right);
        }
        return node;
    }

    private int minValue(TreeNode<Integer> node) {

        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    private int maxValue(TreeNode<Integer> node) {

        while (node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public void find(int data) { }

    public void print(){ }
}
