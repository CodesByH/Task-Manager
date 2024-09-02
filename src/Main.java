import java.util.Date;

public class Main {
    
    //Creates an instance of the TaskManger class to be able to call
    //its methods in the Main.java class
    static TaskManager taskMang = new TaskManager();

    public static void main(String[] args) {
        
        Task t1 = new Task("Dentist", "Appointment at 12:00", new Date(2024-07-2), "High");
        Task t2 = new Task("Barber", "Trim at 14:20", new Date(2024-07-12), "Neutral");
        Task t3 = new Task("Interview", "Meeting with new boss at 16:30", new Date(2024-07-14), "Critical");
       
        taskMang.addTask(t1);
        taskMang.addTask(t2);
        taskMang.addTask(t3);

        //Add task method check
        System.out.println(".addTask() method test");
        for (Task t : taskMang.tasks) {
            System.out.println("Priority Level: " + t.getPriority() + " " 
            + t.getName() + ": " 
            + t.getDescription() + " ");
        }
        System.out.println();

        //Update Method check
        System.out.println(".updateTask() method test");
        taskMang.updateTaskName(t2, "Hairdresser");
        for (Task t : taskMang.tasks) {
            System.out.println("Priority Level: " + t.getPriority() + " " 
            + t.getName() + ": " 
            + t.getDescription() + " ");
        }
        System.out.println();

        //Delete method check
        System.out.println(".deleteTask() method test");
        taskMang.deleteTask(t2);
        for (Task t : taskMang.tasks) {
            System.out.println("Priority Level: " + t.getPriority() + " " 
            + t.getName() + ": " 
            + t.getDescription() + " ");
        }

    

    }
    
}
