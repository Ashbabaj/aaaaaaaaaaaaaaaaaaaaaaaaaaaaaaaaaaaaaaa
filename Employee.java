
/**
 * Abstract class staffMembers - write a description of the class here
 *
 * @author (shbaj3)
 * @version (version number or date here)
 */
public abstract class Employee extends MembersJazanu 
{
    // instance variables - replace the example below with your own
    private double salary;
    private int rank;
    private String jab;
   
    
    // creating new doctor object
    public Employee()
    {
   
       
    }
    
    public Employee(double salary,int rank,String jab)
    {
       super();
       this.salary=salary;
       this.rank= rank;
       this.jab=jab; 
    }

   
    //return the salary of memebar
    public void setSalary(double s)
    {
      this.salary=s;
    }
    public void setSalary(int s)
    {
    this.salary=s;
    }
    
    public abstract double getSalary();
    
    public void setRank(int r)
    {
    this.rank=r;
    }
    
    public double getRank()
     {
         return rank;
     }
    
     
     
     public void setJab(String j)
    {
    this.jab=j;
    }
    
    public  String getJab()
     {
         return jab;
     }
  
    
    
    
    
    
}
