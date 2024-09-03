import java.time.LocalDate;
import java.util.Date;

public class Task {
    
    int taskNo;
    String name;
    String description;
    LocalDate dueDate;
    //Priority levels are: critical, high priority, neutral, low priority, unknown 
    Priority priority;
    boolean comp;

    //Constructor
    public Task(int taskNo, String name, String description, LocalDate dueDate, Priority priority, boolean comp) {
        this.taskNo = taskNo;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.comp = comp;
    }//End Constructor


    //Getters

    //GetTaskNo
    public int getTaskno() {
        return this.taskNo;
}

    //Get Name
    public String getName() {
        return this.name;
    }

    //Get Description
    public String getDescription() {
        return this.description;
    }

    //Get Due Date
    public LocalDate getDueDate() {
        return this.dueDate;
    }

    //Get Priority Boolean
    public Priority getPriority() {
        return this.priority;
    }

    //Get Completed Bool
    public boolean getCompleted() {
        return this.comp;
    }

    //Setters

    public void setTaskNo(int num) {
        this.taskNo = num;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    public void setDate(LocalDate d) {
        this.dueDate = d;
    }

    public void setPriority(Priority p) {
        this.priority = p;
    }

    public void setCompStatus(boolean c) {
        this.comp = c;
    }

}//End Class
