package pl.javastart.task;

public class Work {
    private String name;
    private String description;
    private double priority;
    private Worker worker;

    public Work(String name, String description, double priority, Worker worker) {
        this(name, description, priority);
        this.worker = worker;
    }

    public Work(String name, String description, double priority) {
        this(name, description);
        this.priority = priority;
    }

    public Work(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }
}