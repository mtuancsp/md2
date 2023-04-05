package p12.setup_bst;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(19);
        tree.insert(42);
        tree.insert(31);

        tree.delete(35);
        //traverse tree
        tree.preorder(tree.root);

    }
}
