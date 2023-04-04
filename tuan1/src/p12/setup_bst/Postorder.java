package p12.setup_bst;

public class Postorder {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(10);
        tree.insert(19);
        tree.insert(14);
        tree.insert(27);
        tree.insert(35);
        tree.insert(42);
        tree.insert(31);

        System.out.println("Inorder (sorted): ");
        tree.postorder(tree.root);

    }

}
