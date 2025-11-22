public class DriverQueue {
    public static void main(String[] args) {

        ToDoQueue todo = new ToDoQueue(10);

        todo.enqueue("Task A");
        todo.enqueue("Task B");
        todo.enqueue("Task C");
        todo.enqueue("Task D");

        todo.dequeue();
        todo.enqueue("Task E");
        todo.enqueue("Task F");

        todo.dequeue();
        todo.dequeue();
    }
}

