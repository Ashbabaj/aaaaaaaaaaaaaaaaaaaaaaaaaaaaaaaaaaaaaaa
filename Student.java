
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 public class Student extends MembersJazanu 
{
    
    private int level;
    private double GPU;
     
   public Student(int level,double GPU)
    {
       super();
        this.level=level;
        
    }
    
    
     public Student()
    {
  
    }
    
    public void setLevel(int level)
    {
        this.level=level;
    }
    
     //return level of student
    public int getLevel()
     {
         return level;
     }
     
     
    public void setGPU(int GPU)
    {
        this.GPU=GPU;
    }
    
     public void setGPU(double GPU)
    {
        this.GPU=GPU;
    }
    
     //return GPU of student
   public double getGPU()
     {
         return GPU;
     }
     
   public void  displayInfo(){
    System.out.println("Student's name :" +getName());
    System.out.println(" ID number"+ getId());
    System.out.println(" ID number"+ GPU);
  
   }
}
