import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class main implements ActionListener,MouseListener,MouseMotionListener,KeyListener{
  //PROPERTIES
  JFrame theframe;
  animation thepanel;
  Timer thetimer = new Timer(1000/60, this);
  SuperSocketMaster ssm;
  
  int intPort = 3000;
  String strIP = ssm.getMyAddress();
  
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
  public void keyTyped(KeyEvent evt){
  }
  public void keyPressed(KeyEvent evt){
  }
  
  
  //CONSTRUCTOR
  public main(){
    // panel
    thepanel = new animation();
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension(1280, 720));
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    
    // frame
    theframe = new JFrame("");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.addKeyListener(this);
    theframe.pack();
    theframe.setResizable(false);
    theframe.setVisible(true);
    
    // super socket master
    ssm = new SuperSocketMaster(intPort, this);
    ssm.connect();
    System.out.println(ssm.getMyAddress());
    
    // timer
    thetimer.start();
    
  }
  
  
  //MAIN METHOD
  public static void main(String[] args){
    new main();
  
  }



}
