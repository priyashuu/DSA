import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Create a Priority Queue (Min-Heap by default)
        PriorityQueue<Task> pq = new PriorityQueue<>();

        // Add tasks with priorities
        pq.add(new Task(3, "Task A")); // Priority 3
        pq.add(new Task(1, "Task B")); // Priority 1
        pq.add(new Task(2, "Task C")); // Priority 2

        // Peek at the element with the highest priority (lowest value)
        System.out.println("Peek: " + pq.peek()); // Output: Task(priority=1, name=Task B)

        // Dequeue tasks based on priority
        while (!pq.isEmpty()) {
            System.out.println("Dequeue: " + pq.poll());
        }
    }
}

// Task class with priority and name
class Task implements Comparable<Task> {// Comparable interface is used to compare objects of the same type based on a single property (priority) for sorting and ordering purposes 
    int priority; // Priority of the task
    String name; // Name of the task

    // Constructor
    public Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    // Compare tasks based on their priority
    @Override // Override the compareTo method of the Comparable interface to compare tasks based on their priority values 
    public int compareTo(Task other) { // Compare the current task with another task based on their priority values 
        return Integer.compare(this.priority, other.priority); // Min-Heap (smallest priority first) 
    }

    // To print the task details
    // Output format: Task(priority=3, name=Task A)
    // Output format: Task(priority=1, name=Task B)
    // Output format: Task(priority=2, name=Task C)
    @Override// Override the toString method of the Object class to return a string representation of the task object 
    public String toString() { // Return a string representation of the task object 
        return "priority=" + priority + " name=" + name ; // Return the priority and name of the task as a string 
    }
}
