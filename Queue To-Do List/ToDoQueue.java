public class ToDoQueue {

    private String[] tasks;
    private int front, rear, size, capacity;

    public ToDoQueue(int capacity) {
        this.capacity = capacity;
        tasks = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(String task) {
        if (size == capacity) {
            System.out.println("Queue full!");
            return;
        }
        rear = (rear + 1) % capacity;
        tasks[rear] = task;
        size++;
        System.out.println("Enqueued: " + task);
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue empty!");
            return;
        }
        System.out.println("Dequeued: " + tasks[front]);
        front = (front + 1) % capacity;
        size--;
    }
}
