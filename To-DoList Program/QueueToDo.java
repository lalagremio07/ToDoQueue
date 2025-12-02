import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueToDo {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        Queue<String> tasks = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n=== QUEUE TO-DO (FIFO) ===");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task (Dequeue)");
            System.out.println("3. View Tasks");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.add(sc.nextLine());
                    break;
                case 2:
                    if (!tasks.isEmpty())
                        System.out.println("Completed: " + tasks.poll());
                    else
                        System.out.println("No tasks.");
                    break;
                case 3:
                    System.out.println("\nTasks in Queue:");
                    for (String t : tasks)
                        System.out.println("- " + t);
                    break;
            }
        } while (choice != 4);
    }
}

