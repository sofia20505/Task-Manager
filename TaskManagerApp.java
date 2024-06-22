public class TaskManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManagerImpl taskManager = new TaskManagerImpl();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add new task");
            System.out.println("2. Mark task as completed");
            System.out.println("3. Remove task");
            System.out.println("4. Display list of tasks");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    Task newTask = new Task(taskName);
                    taskManager.addTask(newTask);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter task name to mark as completed: ");
                    String taskToComplete = scanner.nextLine();
                    for (Task task : taskManager.getTasks()) {
                        if (task.getName().equalsIgnoreCase(taskToComplete)) {
                            taskManager.markAsCompleted(task);
                            System.out.println("Task marked as completed.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task name to remove: ");
                    String taskToRemove = scanner.nextLine();
                    for (Task task : taskManager.getTasks()) {
                        if (task.getName().equalsIgnoreCase(taskToRemove)) {
                            taskManager.removeTask(task);
                            System.out.println("Task removed successfully.");
                            break;
                        }
                    }
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}