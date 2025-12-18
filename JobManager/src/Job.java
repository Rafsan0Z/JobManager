import java.util.ArrayList;

public class Job {

    String name;
    String company;
    String jobDescription;
    String deadline;
    String dateFound;
    String location;
    String mode;
    String time;

    ArrayList<Skill> skills;

    public Job(String name){
        this.name = name;
    }

    public String toString(){
        String result = "";

        result += "This job is from " + this.company + " called " + this.name + ", a ";

        if(time.equals("part")) result += "part-time position at ";
        else if(time.equals("full")) result += "full-time position at ";
        else if (time.equals("temp")) result += "temporary position at ";

        return result;

    }


    
}
