import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListToDo {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();
        int choice;

        do {
            System.out.println("\n=== LINKEDLIST TO-DO ===");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Remove First Task");
            System.out.println("4. Remove Last Task");
            System.out.println("5. View Tasks");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    tasks.addFirst(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Enter task: ");
                    tasks.addLast(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Removed: " + tasks.removeFirst());
                    break;
                case 4:
                    System.out.println("Removed: " + tasks.removeLast());
                    break;
                case 5:
                    System.out.println("\nAll Tasks:");
                    for (String t : tasks)
                        System.out.println("- " + t);
                    break;
            }

        } while (choice != 6);
    }
}

