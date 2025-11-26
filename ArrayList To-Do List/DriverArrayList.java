public class DriverArrayList {

    public static void main(String[] args) {

        ToDoArrayList todo = new ToDoArrayList();

        System.out.println("********* BSCS TO-DO LIST ************");


        todo.addTask("Shopee Orders");
        todo.addTask("Finish project");
        todo.addTask("Study for exam");
        todo.addTask("Buy Groceries");
        todo.addTask("Clean the House");

        todo.displayTasks();

        todo.removeTask();
        todo.displayTasks();

        todo.removeTask();
        todo.removeTask();
        todo.removeTask();
    }
}
