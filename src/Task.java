import java.time.LocalDate;
import java.util.Date;

public class Task {
    
    int taskNo;
    String name;
    String description;
    LocalDate dueDate;
    //Priority levels are: critical, high priority, neutral, low priority, unknown 
    String priority;

    //Constructor
    public Task(int taskNo, String name, String description, LocalDate dueDate, String priority) {
        this.taskNo = taskNo;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
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
    public String getPriority() {
        return this.priority;
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

    public void setPriority(String p) {
        this.priority = p;
    }

}//End Class
