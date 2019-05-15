import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class main implements ActionListener,MouseListener,MouseMotionListener,KeyListener{
  //PROPERTIES
	JFrame theframe = new JFrame("can this work thanks");
	animation thepanel = new animation();
	JTextArea chat = new JTextArea();
	JScrollPane thescroll = new JScrollPane(chat);
	JButton send = new JButton("Send");
	Timer thetimer = new Timer(1000/60, this);
	SuperSocketMaster ssm;
  
	int intPort = 3000;
  
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
    thepanel.setLayout(null);
    thepanel.setPreferredSize(new Dimension(1280, 720));
    thepanel.addMouseListener(this);
    thepanel.addMouseMotionListener(this);
    
    // frame
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.addKeyListener(this);
    theframe.pack();
    theframe.setResizable(false);
    theframe.setVisible(true);
    
    // the chat
	thescroll.setBounds(830, 295, 320, 50);
	thepanel.add(thescroll);
	send.setBounds(1160, 295, 100, 50);
	thepanel.add(send);
    
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
