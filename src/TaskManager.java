import java.util.ArrayList;
import java.util.Date;

public class TaskManager {
    
    //ArrayList to store tasks
    ArrayList<Task> tasks = new ArrayList<>();

    //Basic CRUD Operations:
    //Add Tasks to List
    public void addTask(Task t) {
        tasks.add(t);
    }

    //Update tasks
    public void updateTaskName(Task t, String n) {
        t.setName(n);
    }
    public void updateTaskDes(Task t, String d) {
        t.setDescription(d);
    }
    public void updateTaskDD(Task t, Date dd) {
        t.setDate(dd);
    }
    public void updateTaskPriority(Task t, String p) {
        t.setPriority(p);
    }

    //Delete Tasks
    public void deleteTask(Task t) {
        if(tasks.contains(t)) {
            tasks.remove(t);
        }
    }


}//End Class
