

public class teachingStaff extends Employee
{
    private String course;
    private int countC;
    private double salary;
    private int salaryEarned;
    
    public teachingStaff(){
        super();
   
   
    
    }
    
    public void setSalary(double s){
    this.salary=s;
    
    }
    public double addedSalary(int salary){
      return salaryEarned+=salary ;
    }
 
    public void teach(String c1)
    {
      System.out.println("he teachs "+ c1);
      countC++;
    }
    
    
    public void displayIfo(){
        System.out.println("teacher's name"+ getId());
        System.out.println(" ID number"+ getId());
        }
}
