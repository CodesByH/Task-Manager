import java.util.ArrayList;
import java.util.Date;

public class TaskManager {
    
    //ArrayList to store tasks
    ArrayList<Task> Tasks = new ArrayList<>();

    //Basic CRUD Operations:
    //Add Tasks to List
    public void addTask(Task t) {
        Tasks.add(t);
    }

    //Update tasks
    public void updateTaskName(Task t, String n) {
        t.name = n;
    }

    public void updateTaskDescription(Task t, String d) {
        t.description = d;
    }

    public void updateTaskDueDate(Task t, Date dd) {
        t.dueDate = dd;
    }
}//End Class
