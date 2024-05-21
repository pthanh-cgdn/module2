package session10_dsa_list;

public class MyNode<E> {
    E data;
    MyNode<E> next;
    public MyNode(E data) {
        this.data = data;
    }
    public E getData(){
        return this.data;
    }
}
