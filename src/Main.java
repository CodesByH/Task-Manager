import java.util.Date;
import java.time.LocalDate;

public class Main {
    
    //Creates an instance of the TaskManger class to be able to call
    //its methods in the Main.java class
    static TaskManager taskMang = new TaskManager();

    public static void main(String[] args) {
        
        Task t1 = new Task(1, "Dentist", "Appointment at 12:00", LocalDate.of(2024, 7, 2), "High");
        Task t2 = new Task(2, "Barber", "Trim at 14:20", LocalDate.of(2024, 7, 12), "Neutral");
        Task t3 = new Task(3, "Interview", "Meeting with new boss at 16:30", LocalDate.of(2024, 7, 9), "Critical");
       
        taskMang.addTask(t1);
        taskMang.addTask(t2);
        taskMang.addTask(t3);

        //List tasks check
        taskMang.listTasks();
        System.out.println();

        //Add task method check
        Task t4 = new Task(4, "Exam Prep", "Prep for DSA exam", LocalDate.of(2024, 7, 12), "High");
        taskMang.addTask(t4);
        System.out.println("ADD Method check \n");
        taskMang.listTasks();
        System.out.println();

        //Update Method check
        taskMang.updateTaskDes(t4, "DO NOT PREP for DSA Exam");
        System.out.println("UPDATE Method check \n");
        taskMang.listTasks();
        System.out.println();

        //Delete method check
        taskMang.deleteTask(t4);
        System.out.println("DELETE Method check \n");
        taskMang.listTasks();

    }//End Main
}//End class
