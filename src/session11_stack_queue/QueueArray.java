package session11_stack_queue;

public class QueueArray {
    private int capacity;
    private int[] queueArr;
    private int front;
    private int rear;
    private int size = 0;

    public QueueArray(int capacity) {
        queueArr = new int[capacity];
        this.capacity = capacity;
    }

    public boolean isQueueFull() {
        return size < capacity;
    }

    public boolean isQueueEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            return;
        }
        queueArr[size] = item;
        size++;
        if (isQueueEmpty()) {
            front = rear = item;
        } else {
            rear = item;
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            return;
        } else {
            for (int i = 0; i < size - 1; i++) {
                queueArr[i] = queueArr[i + 1];
            }
            front = queueArr[0];
            size--;
        }
    }

    public static void main(String[] args) {

    }
}
