package lab08.prob03;

import java.util.*;

public class LinkedList<T> implements Iterable<T>{

    private static class Node<T> {
        T value;
        Node<T> next;

        // Constructorul de Node
        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    Node<T> firstElement;
    Node<T> lastElement;

    class ListIterator implements Iterator<T> {
        Node<T> cursor;

        public ListIterator() {
            this.cursor = firstElement;
        }

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T val = cursor.value;
            cursor = cursor.next;
            return val;
        }
    }

    // Insereaza un nod la inceputul listei
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (firstElement == null) {
            lastElement = firstElement = newNode;
        }
        else {
            newNode.next = firstElement;
            firstElement = newNode;
        }
    }

    // Insereaza un nod la sfarsitul listei
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (firstElement == null) {
            firstElement = lastElement = newNode;
        }
        else {
            lastElement.next = newNode;
            lastElement = newNode;
        }
    }

    // Returneaza un obiect de tip ListIterator
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}
