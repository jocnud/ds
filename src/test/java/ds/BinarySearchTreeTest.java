package ds;

import static org.junit.Assert.assertTrue;

import ds.tree.BinarySearchTree;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class BinarySearchTreeTest {
    @Test
    public void test() {
        BinarySearchTree<Character> binarySearchTree = new BinarySearchTree<>();
        Arrays.asList('F', 'D', 'J', 'B', 'E', 'G', 'K', 'A', 'C', 'I', 'H')
                .stream()
                .forEach(c -> binarySearchTree.add(c));

        binarySearchTree.inOrderTraverse();
    }

    @Test
    public void inorder() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        Arrays.asList(52,33,65,25,39,60,78,73,90,12,27,34,48)
                .stream()
                .forEach(c -> binarySearchTree.add(c));

        binarySearchTree.inOrderTraverse();
    }


    @Test
    public void preorder() {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        Arrays.asList(52,33,65,25,39,60,78,72,90,12,27,34,48,49)
                .stream()
                .forEach(c -> binarySearchTree.add(c));

        binarySearchTree.preOrderTraverse();

        System.out.println(binarySearchTree.height());


    }
}
