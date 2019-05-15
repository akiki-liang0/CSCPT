import java.awt.*;
import javax.swing.*;

public class animation extends JPanel{
	// properties
	
	
	// methods
	public void paintComponent(Graphics g){
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, 1280, 720);
		g.setColor(Color.WHITE);
		g.fillRect(10, 60, 675, 600);
		g.setColor(Color.RED);
		g.fillRect(820, 10, 450, 345);
		g.setColor(Color.BLUE);
		g.fillRect(820, 365, 450, 345);
	}
	
	// constructor
	public animation(){
		super();
	}
}



