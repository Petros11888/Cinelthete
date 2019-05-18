import java.util.*;

public class Ticket
{
   
    private String type;
    private float price; 

    
    public Ticket()
    {
        
      
    }

    
    public void highlightMistakes() {}
    
    public void messageToUser(){}
    
    public void validityCheck(){
    
    }
    
    public void checkTicketType(){}
    
    public boolean checkType(int age, String type){
        if (this.getTicketType()=="Anilikos" && age>18)
            return false;
        else if (this.getTicketType()=="Enilikos" && age<18)
            return false;
        else
            return true;
    }
    
    public void falseTicketChoise(){
        System.out.println("Lathos epilogi Eisitiriou, Prospathiste ksana");
    }
    
    public String getTicketType(){
        return type;
    }
}
