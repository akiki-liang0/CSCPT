import java.awt.*;
import javax.swing.*;

public class animation extends JPanel{
	// PROPERTIES
	
	
	// METHODS
	public void paintComponent(Graphics g){
		// background
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 1280, 720);
		
		// game board
		g.setColor(Color.WHITE);
		g.fillRect(10, 60, 675, 600);
		
		// chat area
		g.setColor(Color.RED);
		g.fillRect(820, 10, 450, 345);
		
		// rankings
		g.setColor(Color.BLUE);
		g.fillRect(820, 365, 450, 345);
	}
	
	// CONSTRUCTOR
	public animation(){
		super();
	}
}



