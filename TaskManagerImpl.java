import java.util.ArrayList;
import java.util.List;

public class TaskManagerImpl implements TaskManager {
    private final List<Task> tasks;

    public TaskManagerImpl() {
        tasks = new ArrayList<>();
    }

    @Override
    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public void markAsCompleted(Task task) {
        task.setCompleted(true);
    }

    @Override
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    @Override
    public void displayTasks() {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println(task.getName() + " - Completed: " + task.isCompleted());
        }
    }

    // Getter for tasks (optional)
    public List<Task> getTasks() {
        return tasks;
    }
}