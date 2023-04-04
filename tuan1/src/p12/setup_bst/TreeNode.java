package p12.setup_bst;

public class TreeNode <E>{
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;

    protected TreeNode(E e) {
        element = e;
    }
}
