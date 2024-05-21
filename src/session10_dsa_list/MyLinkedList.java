package session10_dsa_list;

public class MyLinkedList<E> {
    private MyNode<E> head = null;
    private MyNode<E> tail = null;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E e) {
        MyNode<E> newNode = new MyNode(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        MyNode<E> newNode = new MyNode(e);
        if (head == null) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        numNodes++;
    }

    public void add(int index, E e) {
        MyNode temp = head;
        MyNode holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new MyNode(e);
        temp.next.next = holder;
        numNodes++;
    }

    public E remove(int index) {
        MyNode<E> previousNode = head;
        if (index < 0 || index >= numNodes) {
            return null;
        } else if (index == 0) {
            previousNode = head;
            head = head.next;
            return previousNode.data;
        } else {
            for (int i = 0; i < index - 1; i++) {
                previousNode = previousNode.next;
            }
            MyNode<E> temp = previousNode.next;
            previousNode.next = temp.next;
            return temp.data;
        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        } else {
            MyNode<E> temp = head;
            head = head.next;
            return temp.data;
        }
    }

    public E removeLast() {
        if (head == null) {
            return null;
        }
        MyNode<E> finalNodes = head;
        for (int i = 0; i < numNodes - 1; i++) {
            finalNodes = finalNodes.next;
        }
        MyNode<E> temp = finalNodes;
        finalNodes = null;
        numNodes--;
        return temp.data;
    }

    public boolean remove(E e) {
        if (head == null) {
            return false;
        } else {
            if (head.data.equals(e)) {
                head = head.next;
                numNodes--;
                return true;
            } else {
                MyNode<E> previous = head;
                for (int i = 0; i < numNodes - 1; i++) {
                    if (previous.next.data.equals(e)) {
                        previous.next = previous.next.next;
                        numNodes--;
                        return true;
                    }
                    previous = previous.next;
                }
                return false;
            }
        }
    }
    public int size(){
        return numNodes;
    }
    public E[] clone() {
        E[] temp = (E[]) new Object[numNodes];
        MyNode<E> currentNode = head;
        for (int i = 0; i < numNodes; i++) {
            temp[i] = currentNode.data;
            currentNode = currentNode.next;
        }
        return temp;
    }
    public boolean contains(E e) {
        MyNode<E> currentNode = head;
        for (int i = 0; i < numNodes; i++) {
            if (currentNode.data.equals(e)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    public int indexOf(E e) {
        MyNode<E> currentNode = head;
        for (int i = 0; i < numNodes; i++) {
            if (currentNode.data.equals(e)) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }
    private void ensureMinCapacity(int minCapacity){
    }
    public E get(int index) {
        MyNode<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public E getFirst(){
        if (head == null) {
            return null;
        }
        return head.data;
    }
    public E getLast(){
        MyNode<E> currentNode = head;
        if (head == null) {
            return null;
        }
        for (int i = 0; i < numNodes; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
    public void clear(){
        head = null;
        numNodes = 0;
    }
}
