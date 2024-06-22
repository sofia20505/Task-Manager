public class Task implements Comparable<Task> {
    private final String name;
    private boolean completed;

    public Task(String name) {
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", completed=" + completed +
                '}';
    }

    @Override
    public int compareTo(Task other) {
        return this.name.compareTo(other.getName());
    }
}
