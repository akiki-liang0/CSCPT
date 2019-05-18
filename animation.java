import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class animation extends JPanel{
	// PROPERTIES
	BufferedImage flag;
	
	// METHODS
	public void paintComponent(Graphics g){
		// this is the flag
		/*
		try{
			flag = ImageIO.read(new File("flag.jpg"));
		}catch(IOException e){
			
		}
		g.drawImage(flag, 0, 0, null);
		*/
		
		// background
		g.setColor(new Color(255, 234, 167));
		g.fillRect(0, 0, 1280, 720);
		
		// game board
		g.setColor(Color.WHITE);
		g.fillRect(10, 60, 675, 600);
		
		// chat area
		g.setColor(new Color(116, 185, 255));
		g.fillRect(820, 10, 450, 345);
		
		// rankings
		g.setColor(new Color(250, 177, 160));
		g.fillRect(820, 365, 450, 345);
	}
	
	// CONSTRUCTOR
	public animation(){
		super();
	}
}



<<<<<<< HEAD






=======
>>>>>>> parent of c8fe311... Update animation.java
