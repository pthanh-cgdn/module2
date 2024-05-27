package session12_java_collection_framework.tree;

public interface Tree <E> {
    boolean insert(E e);
    void inorder();
    int getSize();
    void postorder();
    boolean delete(E e);
    void preorder();
    boolean contains(E e);
}
