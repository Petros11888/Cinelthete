import javax.swing.*;

public class Eisagwgi_Stoixeiwn extends JFrame
{
    //Eisagwgi stoixeiwn Plirwmis
    JTextField first_name = new JTextField();
    JTextField card_number= new JTextField();
    JTextField last_name = new JTextField();
    JTextField name_on_card= new JTextField();
    JTextField email = new JTextField();
    JTextField card_type = new JTextField();
    JTextField address = new JTextField();
    JTextField CVC_code = new JTextField();
    JButton oloklorwsi = new JButton("Oloklirwsi Agoras");
    
    //Epilogi Perioxis Kinimatografou
    JTextField choose_location = new JTextField();
    JTextField choose_theater = new JTextField();
    

   
    public Eisagwgi_Stoixeiwn()
    {   
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public void siblirwsiPlirwmis(){
        JPanel pane = new JPanel();
        JLabel first_name_label = new JLabel("first name: ");
        JLabel card_number_label = new JLabel("cardnumber: ");
        JLabel last_name_label = new JLabel("last name: ");
        JLabel name_on_card_label= new JLabel("name on Card: ");
        JLabel email_label = new JLabel("email: ");
        JLabel card_type_label =  new JLabel("card type: ");
        JLabel address_label = new JLabel("address: ");
        JLabel CVC_code_label = new JLabel("CVC: ");
        pane.add(first_name_label);
        pane.add(first_name);
        pane.add(card_number_label);
        pane.add(card_number);
        pane.add(last_name_label);
        pane.add(last_name);
        pane.add(name_on_card_label);
        pane.add(name_on_card);
        pane.add(email_label);
        pane.add(email);
        pane.add(card_type_label);
        pane.add(card_type);
        pane.add(address_label);
        pane.add(address);
        pane.add(CVC_code_label);
        pane.add(CVC_code);
        add(pane);
        setVisible(true);
    }
    
    
    public void epilogiPerioxis(){
        JPanel pane = new JPanel();
        JLabel choose_location_label = new JLabel("Choose Location: ");
        JLabel choose_theater_label = new JLabel("Choose Theater: ");
        pane.add(choose_location_label);
        pane.add(choose_location);
        pane.add(choose_theater_label);
        pane.add(choose_theater);
        
    }
    

    
    
}
