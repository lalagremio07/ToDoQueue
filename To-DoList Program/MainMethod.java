import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" TO-DO LIST PROGRAM ");
            System.out.println("1. ArrayList To-Do List");
            System.out.println("2. Queue To-Do List");
            System.out.println("3. LinkedList To-Do List");
            System.out.println("4. Exit");
            System.out.print("Choose data structure: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    ArrayListToDo.start();
                    break;
                case 2:
                    QueueToDo.start();
                    break;
                case 3:
                    LinkedListToDo.start();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 4);

        
    }
}

