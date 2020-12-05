
/**
 * Abstract class MembersJazanu - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class MembersJazanu
{
    private String name;
    private int ID ;
    private int age;
    private String email;
    private String nationality;
    
    
    
   public MembersJazanu()
   {
       
    }
    
   public MembersJazanu(String name, int ID,int age,String email,String nationality)
   {
       this.name=name;
       this.ID=ID;
       this.email=email;
       this.nationality=nationality;
       this.age=age;
    }
    
    public void setId(int id )
    {
       ID=id;
    }
    //return the id
    public int getId()
    {
        return ID;
    }
    
    public void setName(String n)
    {
        name=n;
    }
    //return  name
    public String getName()
    {
       return name; 
    }
    
    public void setEmail(String e)
    {
        email=e;
    }
    //return  name
    public String getEmail()
    {
       return email; 
    }
    public void setNationality(String n)
    {
       nationality=n;
    }
    
    public String getNationality()
    {
       return nationality;
    }
    
    
     public void setAge(int a )
    {
       age=a;
    }
    //return the id
    public int getAge()
    {
        return age;
    }
    
      public String toString() {
        return "name :" +name+
                " ID number"+ ID+"he is "+age+"old"+"he is "+"natioa;ity";
  
   }

}
