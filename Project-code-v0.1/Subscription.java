import java.util.*;

public class Subscription
{
    
    private Date date_of_subscription_ending;
    private float amount;

    
    public Subscription()
    {
       
    }

    public void displaySubscriptionInfo(){
        System.out.println("H sindromi isxuei mexri: " + date_of_subscription_ending +
        " kai antistoixei se minaio poso: " + amount);
    }
    
    public void displayPaymentPage(){}
    
    public void displayErrorMessage(){
        System.out.println("H plirwmi apetixe dokimaste ksana");
    }
    
    public void displaySuccessMessage(){
        System.out.println("H plirwmi oloklirwthike me epitixia");
    }
    
}
