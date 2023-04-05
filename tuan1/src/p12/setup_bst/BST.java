package p12.setup_bst;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            insert(elements[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            /*locate the parent node*/
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; /*Duplicate node not inserted*/
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true; /*element inserted successfully*/

    }


    private TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    public void postorder(TreeNode<E> root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    public void preorder(TreeNode<E> root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public boolean delete(E e) {
        // Tìm kiếm phần tử cần xóa và lưu lại node hiện tại và node cha của nó
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // phần tử cần xóa đã được tìm thấy
            }
        }

        // Nếu phần tử cần xóa không tồn tại trong cây, trả về false
        if (current == null) {
            return false;
        }

        // Nếu phần tử cần xóa là lá hoặc chỉ có một con, xoá phần tử đó và nối con còn lại (nếu có) vào cha của nó
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }

        } else if (current.right == null) {
            if (parent == null) {
                root = current.left;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }

        } else { // Nếu phần tử cần xóa có cả hai con
            // Tìm phần tử lớn nhất ở cây con trái của phần tử cần xóa
            TreeNode<E> maxNode = current.left;
            TreeNode<E> maxNodeParent = current;
            while (maxNode.right != null) {
                maxNodeParent = maxNode;
                maxNode = maxNode.right;
            }

            // Sao chép giá trị của phần tử lớn nhất vào phần tử cần xóa và xoá phần tử lớn nhất
            current.element = maxNode.element;
            if (maxNodeParent.right == maxNode) {
                maxNodeParent.right = maxNode.left;
            } else {
                maxNodeParent.left = maxNode.left;
            }
        }

        size--;
        return true;
    }

    //search
    public boolean contains(E e) {
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public TreeNode<E> search(E e) {
        return search(root, e);
    }

    private TreeNode<E> search(TreeNode<E> node, E e) {
        while (node != null && e.compareTo(node.element) != 0) {
            if (e.compareTo(node.element) < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return node;
    }



}
