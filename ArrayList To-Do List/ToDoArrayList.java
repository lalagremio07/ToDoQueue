import java.util.ArrayList;

public class ToDoArrayList {

    private ArrayList<String> tasks;

    public ToDoArrayList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added: " + task);
    }

    public void removeTask() {
        if (!tasks.isEmpty()) {
            System.out.println("Removed: " + tasks.remove(0));
        } else {
            System.out.println("No tasks to remove.");
        }
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (String t : tasks) {
            System.out.println("- " + t);
        }
    }
}

