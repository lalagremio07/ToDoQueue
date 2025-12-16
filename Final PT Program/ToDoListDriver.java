import java.util.Scanner; 
public class ToDoListDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ToDoList todo = new ToDoList();
        int choice;

        do {
            System.out.println("\n=== TO-DO LIST ===");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Display All");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    todo.addTask(sc.nextLine());
                    break;

                case 2:
                    todo.completeTask();
                    break;

                case 3:
                    todo.displayAll();
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}

