 import java.util.ArrayList;
 import java.util.Scanner;

public class ArrayListToDo {

    public static void start() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== ARRAYLIST TO-DO ===");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
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
                    System.out.print("Enter task number to remove: ");
                    int index = sc.nextInt() - 1;
                    if (index >= 0 && index < tasks.size())
                        tasks.remove(index);
                    else
                        System.out.println("Invalid index.");
                    break;
                case 3:
                    System.out.println("\nTasks:");
                    for (int i = 0; i < tasks.size(); i++)
                        System.out.println((i+1) + ". " + tasks.get(i));
                    break;
            }

        } while (choice != 4);
    }
}
 
