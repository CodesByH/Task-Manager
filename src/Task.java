import java.util.Date;

public class Task {
    
    String name;
    String description;
    Date dueDate;
    boolean priority;

    //Constructor
    public Task(String name, String description, Date dueDate, boolean priority) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
    }//End Constructor


    //Getters
    //Get Name
    public String getName() {
        return this.name;
    }

    //Get Description
    public String getDescription() {
        return this.description;
    }

    //Get Due Date
    public Date getDueDate() {
        return this.dueDate;
    }

    //Get Priority Boolean
    public boolean getPriority() {
        return this.priority;
    }

    //Setters

    public void setName(String n) {
        this.name = n;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    public void setDate(Date d) {
        this.dueDate = d;
    }

    public void setPriority(boolean p) {
        this.priority = p;
    }

}//End Class
