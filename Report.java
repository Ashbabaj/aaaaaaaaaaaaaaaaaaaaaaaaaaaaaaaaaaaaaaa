
/**
 * Write a description of class Report here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.HashMap;
 import java.util.Scanner;
 import java.util.Iterator;
 import java.util.Set;
 import java.util.Map;

 
public class Report
{
   // instance variables - replace the example below with your own

  private static int count=1;
  private int reportID;
    
  public void tyepOfReport() {
    
        HashMap<Integer, String> s = new HashMap<Integer, String>();
        s.put(1, "calls");
        s.put(2, "emails");
        s.put(3, "LiveChat");
        s.put(4, "TechReq");
         // Getting a Set of Key-value pairs
        Set entrySet = s.entrySet();
        Iterator it = entrySet.iterator();
        while(it.hasNext()){
           Map.Entry me = (Map.Entry)it.next();
           System.out.println("Number of Services : "+me.getKey() + 
           " & " + 
           " Services is: "+me.getValue());
         }
        
        
    
  }

  public void generateReport() {
        reportID=count;
        count++;
         tyepOfReport();
        Scanner in= new Scanner(System.in);
        System.out.println("Report ID: "+reportID);
        System.out.println("please enter Number of Services : ");
        int port=in.nextInt();
        
        System.out.println("----------------------------------------------------");
        System.out.println("Report ID: "+reportID);
        System.out.println("Number of Services generated: "+ port);
          String Server="";  
        
        switch(port){    
                 //case statements within the switch block  
                case 1:Server="055****";  
                break;    
                case 2: Server="Shbaj3@gmail.com";  
                break;    
                case 3: Server="livechatbot.net";  
                break;    
                case 4: Server="***************";  
                break;    
                 
                default:System.out.println("Invalid Server!");    
            }    
        //Printing month of the given number  
        System.out.println(Server);  
        }  
        public int getIdReport()
        {
            return reportID;
        }
        
}
