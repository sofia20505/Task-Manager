public interface TaskManager {
    void addTask(Task task);
    void markAsCompleted(Task task);
    void removeTask(Task task);
    void displayTasks();