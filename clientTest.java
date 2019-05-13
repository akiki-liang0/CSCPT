import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class clientTest implements actionListener{
  //PROPERTIES
  JFrame theframe;
  animation thepanel;
  SuperSocketMaster ssm;
  
  //METHODS
  public void actionPerformed(ActionEvent evt){
    
    
  }
  
  //CONSTRUCTOR
  public chatTest(){
    // panel 
    thepanel = new animation();
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension(0,0));
    
    theframe = new JFrame("");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setConentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
    
    ssm = new SuperSocketMaster(main.strIP, main.intPort, this);
    ssm.connect();
    
  }
  
  //MAIN METHOD
  public static void main(String[] args){
    new clientTest();
    
  }

}
