import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class main implements ActionListener,MouseListene,MouseMotionListener,KeyListener{
  //PROPERTIES
  JFrame theframe = new JFrame("");
  animation thepanel = new animation();
  Timer thetimer = new Timer(1000/60, this);
  SuperSocketMaster ssm = new SuperSocketMaster(3000, this);
  //METHODS
  public void actionPerformed(ActionEvent evt){
  }
  public void mouseMoved(MouseEvent evt){
  }
  public void mouseDragged(MouseEvent evt){
  }
  public void mouseExited(MouseEvent evt){
  }
  public void mouseEntered(MouseEvent evt){
  }
  public void mousePressed(MouseEvent evt){
  }
  public void mouseReleased(MouseEvent evt){
  }
  public void mouseClicked(MouseEvent evt){
  }
  public void keyReleased(KeyEvent evt){
  }
  public void keyTyped(MouseEvent evt){
  }
  public void kayPressed(MouseEvent evt){
  }
  
  
  //CONSTRUCTOR
  public main(){
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension(0,0));
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    
    theframe.setDefaultCLoseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.addKeyListener(this);
    theframe.pack();
    theframe.setVisible(true);
    
    thetimer.start();
    
  }
  
  
  //MAIN METHOD
  public static void main(String[] args){
    new main();
  
  }



}
