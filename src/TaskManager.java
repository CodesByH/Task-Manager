import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    public void updateTaskPriority(Task t, Priority p) {
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
                " | " + "Due Date: " + formatter(t) +
                " | " + "Completed Status: " + t.getCompleted()
            );
        }
    }

    //Sorting by date algorithm
    public void sortTasksByDate() {

        //Define comparitor
        Comparator<Task> byDate = (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate());
        //Use the Collections.sort(method which takes a list and a comparitor)
        Collections.sort(tasks, byDate);
    }


    //Sorting by Priority algorithm
    public void sortTasksByPriority() {

    //Define Comparitor
        Comparator<Task> byPriority = (t1, t2) -> t1.getPriority().compareTo(t2.getPriority());
        Collections.sort(tasks, byPriority);
    }


    //Sorting by Completion status
    public void sortByCompStatus () {
        //Define Comparitor
        Comparator<Task> byCompStatus = (t1, t2) -> Boolean.compare(t2.getCompleted(), t1.getCompleted());
        Collections.sort(tasks, byCompStatus);
    }


}//End Class
