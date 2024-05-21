package session10_dsa_list;

public class List<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    E[] elements;

    public List() {

    }

    public List(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public void add(int index, E o) {
        if (size++ > elements.length) {
            ensureCapacity(size + 1);
        }
        if (index >= 0 & index < size) {
            for (int i = index + 1; i <= size; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = o;
            size++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            E temp = elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size--;
            return temp;
        }
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        E[] temp = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = elements[i];
        }
        return temp;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (size + 1 > elements.length) {
            return false;
        }
        elements[size] = e;
        size++;
        return true;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > size) {
            E[] temp = elements;
            elements = (E[]) new Object[minCapacity];
            for (int i = 0; i < size; i++) {
                elements[i] = temp[i];
            }
        }
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return elements[i];
    }

    public void clear() {
        size = 0;
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

}
