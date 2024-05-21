package session10_dsa_list;

public class Node<E> {
    E element;
    Node<E> next;

    public Node(E e) {
        element = e;
    }

    Node<E> head = null;
    Node<E> tail = null;
    int size = 0;

    public void addFist(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = tail = newNode;
            ;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFist(e);
        } else if (index >= size) {
            addLast(e);
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            Node temp = currentNode;
            currentNode = new Node(e);
            currentNode.next = temp;
        }
        size++;
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        } else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index >= size || index < 0) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else {
            Node currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.next;
            }
            Node<E> temp = currentNode.next;
            size--;
            currentNode.next = temp.next;
            return temp.element;
        }
    }
}
