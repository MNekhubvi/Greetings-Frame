
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsGUI  extends JFrame
{
    //panels
    private JPanel namePn1; 
    private JPanel surnamePn1;
    private JPanel nameAndSurnamePn1;
    private JPanel greetingsAreaPn1;
    private JPanel btnsPn1;
    private JPanel mainPn1;
    private JPanel headingPn1;
    
    
    // lebels
    
    private JLabel headingLb1;
    private JLabel nameLb1;
    private  JLabel surnameLb1;
    
    //textfields
    
    private JTextField nameTxtF1d;
    private JTextField SurnameTxtF1d;
    //textarea
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public GreetingsGUI()
    {
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");
        setSize(600, 500);
        setBackground(Color.yellow);
        
      //create the panels
      namePn1 = new JPanel(new FlowLayout());
      surnamePn1 = new JPanel(new FlowLayout());
      
      nameAndSurnamePn1 = new JPanel (new GridLayout(2, 1));
      
      greetingsAreaPn1 = new JPanel(new FlowLayout());
      greetingsAreaPn1.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1), "Greetings"));
      
      btnsPn1 = new JPanel (new FlowLayout());
      mainPn1 = new JPanel (new BorderLayout());
      
      headingPn1 = new JPanel(new FlowLayout (FlowLayout.CENTER));
      headingPn1.setBorder(new BevelBorder(BevelBorder.RAISED));
      
     //create the labels 
     headingLb1 = new JLabel ("Greetings App");
     nameLb1 = new JLabel ("Name: ");
     surnameLb1 = new JLabel ( "Surnane: ");
     
    // create the text fiedls 
    nameTxtF1d = new JTextField(20);
    SurnameTxtF1d = new JTextField(20);
    
    //create the text area
    greetingsTxtArea = new JTextArea(40, 50);
    greetingsTxtArea.setEditable(false);
    greetingsTxtArea.setText("Hello [name]  [surname]");
    
    //create buttons
    
    greetBtn = new JButton("Greet");
    clearBtn = new JButton ("Clear");
    exitBtn  = new JButton ("Exit");
    
    //add name label textfield to the name panel
    namePn1.add(nameLb1);
    namePn1.add(nameTxtF1d);
    
    //add surname label textfield to the surname panel
    
    surnamePn1.add(surnameLb1);
    surnamePn1.add(SurnameTxtF1d); 
    
    //add the name and surname panel to the surname collective panel
    nameAndSurnamePn1.add(namePn1);
    nameAndSurnamePn1.add(surnamePn1);
      
    //add the greetings area to its panel
    greetingsAreaPn1.add(greetingsTxtArea);
    
    //add buttons to their panel
    btnsPn1.add(greetBtn);
    btnsPn1.add(clearBtn);
    btnsPn1.add(exitBtn);
    
    //add all the panels to the main panel
    mainPn1.add(nameAndSurnamePn1, BorderLayout.NORTH);
    mainPn1.add(greetingsAreaPn1,BorderLayout.CENTER);
    mainPn1.add(btnsPn1, BorderLayout.SOUTH);
    
   // add the main panel to the frame's panel
   add(headingPn1,BorderLayout.NORTH);
   add(mainPn1,BorderLayout.CENTER);
   
   //make the frame visible
        setVisible(true);
   
    
    }
}
