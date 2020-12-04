

public class teachingStaff extends Employee
{
    private String course;
    private int countC;
    private int salary;
    
    public teachingStaff(){
        super();
   
   
    
    }
    
   
    public double getSalary(){
      return salary ;
    }
 
    public void teach(String c1)
    {
      System.out.println("he teachs "+ c1);
      countC++;
    }
    
    
    public void displayIfo(){
        
        
        }
}
