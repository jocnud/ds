package ds.list;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedList<T> implements Iterable<T> {

    private Node<T> root;
    private int size;

    public void addFirst(T data) {
        Node<T> node = new Node<>(data, null);
        if (root == null) {
            root = node;
        } else {
            node.next = root;
            root = node;
        }
        size++;
    }


    private class MyIterator implements Iterator<T> {

        private Node<T> traverseNode = root;

        @Override
        public boolean hasNext() {
            return traverseNode != null;
        }

        @Override
        public T next() {
            Node<T> resultNode = traverseNode;
            traverseNode = traverseNode.next;
            return resultNode.data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
