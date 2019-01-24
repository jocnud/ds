package ds.tree;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> root;

    public void add(T data) {
        Node<T> nodeToAdd = new Node<>(data);
        if (root == null) {
            root = nodeToAdd;
        } else {
            traverseAndAdd(nodeToAdd, root);
        }
    }


    private void inOrderTraverse(Node<T> traverseNode) {

        if (traverseNode.leftChild != null) {
            inOrderTraverse(traverseNode.leftChild);
        }
        System.out.print(traverseNode.data + " -> ");

        if (traverseNode.rightChild != null) {
            inOrderTraverse(traverseNode.rightChild);
        }
    }

    private void preOrderTraverse(Node<T> traverseNode) {

        System.out.print(traverseNode.data + " -> ");

        if (traverseNode.leftChild != null) {
            preOrderTraverse(traverseNode.leftChild);
        }

        if (traverseNode.rightChild != null) {
            preOrderTraverse(traverseNode.rightChild);
        }
    }

    public void inOrderTraverse() {
        // LPR :: keep in going to left hand side of the tree till we go last and output
        if (root != null) {
            inOrderTraverse(root);
        }
    }

    public void preOrderTraverse() {
        // PLR :: keep in going to left hand side of the tree till we go last and output
        if (root != null) {
            preOrderTraverse(root);
        }
    }

    public int height() {
        if (root == null) {
            return 0;
        } else {

            return height(root);
        }
    }

    private int height(Node<T> traverseNode) {

        int leftChildHeight = 0;
        int rightChildHeight = 0;

        if (traverseNode.leftChild != null) {
            leftChildHeight = height(traverseNode.leftChild);
        }

        if (traverseNode.rightChild != null) {
            rightChildHeight = height(traverseNode.rightChild);
        }

        return 1 + Math.max(leftChildHeight,rightChildHeight) ;
    }

    private void traverseAndAdd(Node<T> nodeToAdd, Node<T> traverseNode) {

        if (nodeToAdd.data.compareTo(traverseNode.data) < 0) {

            // need add to left side of the tree
            if (traverseNode.leftChild == null) {
                // since null found add here
                traverseNode.leftChild = nodeToAdd;
            } else {
                traverseAndAdd(nodeToAdd, traverseNode.leftChild);
            }
        } else {

            // need to add to the right side of the tree
            if (traverseNode.rightChild == null) {
                // since null found add here
                traverseNode.rightChild = nodeToAdd;
            } else {
                traverseAndAdd(nodeToAdd, traverseNode.rightChild);
            }

        }

    }

    private static class Node<T> {
        T data;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T data) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

}
