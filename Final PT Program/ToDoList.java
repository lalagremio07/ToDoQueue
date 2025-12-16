import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ToDoList {

    ArrayList<String> arrayList;
    Queue<String> queue;
    LinkedList<String> linkedList;

    public ToDoList() {
        arrayList = new ArrayList<>();
        queue = new LinkedList<>();
        linkedList = new LinkedList<>();
    }

    public void addTask(String task) {
        arrayList.add(task);       // Store in ArrayList
        queue.add(task);           // Store in Queue
        linkedList.add(task);      // Store in LinkedList
    }

    public void completeTask() {
        if (!queue.isEmpty()) {
            String doneTask = queue.poll();  // FIFO removal
            arrayList.remove(doneTask);
            linkedList.remove(doneTask);
            System.out.println("Completed: " + doneTask);
        } else {
            System.out.println("No tasks to complete.");
        }
    }

    public void displayAll() {
        System.out.println("\nArrayList (All Tasks): " + arrayList);
        System.out.println("Queue (Order): " + queue);
        System.out.println("LinkedList (Priority): " + linkedList);
    }
}
