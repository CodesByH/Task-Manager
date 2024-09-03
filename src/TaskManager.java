import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


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
    public void updateTaskDD(Task t, LocalDate dd) {
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

    //Format Date
    public String formatter(Task t) {
        LocalDate d = t.getDueDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return d.format(formatter);
    }

    //List tasks
    public void listTasks() {
        for (Task t : tasks) {
            System.out.println(
                "Task No: " + t.getTaskno() + 
                " | " + t.getName() + 
                " | " + "Priority: " + t.getPriority() + 
                " | " + "Description: " + t.getDescription() +
                " | " + "Due Date: " + formatter(t)
            );
        }
    }


}//End Class
