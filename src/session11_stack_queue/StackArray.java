package session11_stack_queue;

public class StackArray {
    private int arr[];
    private int size;
    private int index = 0;

    public StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public int pop(){
        if (isEmpty()) {
            throw new StackOverflowError("Stack is Empty");
        }
        return arr[index--];
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        return index==0;
    }
    public boolean isFull(){
        return index==size;
    }
}
