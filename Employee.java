
/**
 * Abstract class staffMembers - write a description of the class here
 *
 * @author (shbaj3)
 * @version (version number or date here)
 */
public abstract class Employee extends MembersJazanu 
{
    // instance variables - replace the example below with your own
   
    private int rank;
    private String job;
   
    
    // creating new doctor object
    public Employee()
    {
   
       
    }
    
    public Employee(int rank,String job)
    {
       super();
       
       this.rank= rank;
       this.job=job; 
    }

   
    //abtract method
  
    public abstract void setSalary(double s);
   
   
    
    public void setRank(int r)
    {
    this.rank=r;
    }
    
    public double getRank()
     {
         return rank;
     }
    
     
     
     public void setJob(String j)
    {
    this.job=j;
    }
    
    public  String getJob()
     {
         return job;
     }
  
     public String toString() {
        return "his rank :" +rank+
                " he is "+ job;
  
   }
    
    
    
    
}
