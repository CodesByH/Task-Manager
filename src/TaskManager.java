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
    public void updateTask(Task t, String n, String d, Date dd, boolean p) {
        t.setName(n);
        t.setDescription(d);
        t.setDate(dd);
        t.setPriority(p);
    }

    //Delete Tasks
    

    
}//End Class
