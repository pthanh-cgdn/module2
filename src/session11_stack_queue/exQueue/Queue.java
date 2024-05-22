package session11_stack_queue.exQueue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enQueue(int num) {
        Node newNode = new Node(num);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    public Node deQueue() {
        Node temp = front;
        if (front == null) {
            return null;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
            rear.link = front;
        }
        return temp;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(14);
        queue.enQueue(22);
        queue.enQueue(-6);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(9);
        queue.enQueue(20);
        System.out.println(queue.front.data);
    }
}
