import java.util.ArrayList;

public class Final_65022432 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setName("Tom");
        emp1.setPosition("UX/UI");
        emp1.setEmpID("0001");

        Project empP1 = new Project();
        empP1.setProjectName("Web A");
        empP1.setDescriptionProject("Developing a web application.");
        emp1.addProject(empP1);
        
        Project empP2 = new Project();
        empP2.setProjectName("Mobile app A");
        empP2.setDescriptionProject("Developing a mobile App.");
        emp1.addProject(empP2);

        System.out.println("*********************************");
        emp1.showDetails();
        System.out.println("*********************************");
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Employee emp2 = new Employee();
        emp2.setName("Tim");
        emp2.setPosition("Front End");
        emp2.setEmpID("0002");
        
        Project empP3 = new Project();
        empP3.setProjectName("Web A");
        empP3.setDescriptionProject("Developing a web application.");
        emp2.addProject(empP3);
        
        emp2.showDetails();
        System.out.println("*********************************");
        System.out.println(empP1.getProject());
    }
}

interface Person {
    public String getName();
    public void setName(String name);
    public int getAge();
    public void setAge(int age);
}

interface Job {
    public String getPosition();
    public void setPosition(String position);
    public String getEmpID();
    public void setEmpID(String empid);
}

class Employee implements Person,Job {
    private String Name;
    private double Age;
    private String Position;
    private String EmpID;
    protected ArrayList<Project> Myproject = new ArrayList<Project>();;

    public String getName(){
        return this.Name;
    }

    public void setName(String name){
        this.Name = name;
    }

    public int getAge(){
        int IntAge = (int)this.Age;
        return IntAge;
    }

    public void setAge(int age){
        this.Age = age;
    }

    public String getPosition(){
        return this.Position;
    }

    public void setPosition(String position){
        this.Position = position;
    }

    public String getEmpID(){
        return this.EmpID;
    }

    public ArrayList<Project> abc(){
        return this.Myproject;
    }

    public void setEmpID(String empid){
        this.EmpID = empid;
    }

    public void addProject(Project project){
        this.Myproject.add(project);
    }

    public void showDetails(){
        System.out.println("Name : " + this.Name + "\nposition : " + this.Position + "\nEmpID : " + this.EmpID);
        System.out.println("Projects");
        for (int i = 0; i < Myproject.size(); i++) {
            // System.out.println("      "+this.Myproject.get(i).getNameP() + " : " + this.Myproject.get(i).getDesP());
            System.out.println("      " + this.Myproject.get(i).getProject());
        }
    }
}

class Project extends Employee {
    private String projectName;
    private String Description;

    public void setProjectName(String name){
        this.projectName = name;
    }

    public String getNameP(){
        return this.projectName;
    }

    public void setDescriptionProject(String description){
        this.Description = description;
    }

    public String getDesP(){
        return this.Description;
    }

    public String getProject(){
        return this.getNameP() + " : " + this.getDesP();
    }

}