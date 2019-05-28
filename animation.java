import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class animation extends JPanel{
	//PROPERTIES
	BufferedImage gameBoard;
	BufferedImage gameBoardDark;
	BufferedImage mainMenu;
	BufferedImage helpScreen1;
	BufferedImage helpScreen2;
	BufferedImage helpScreen3;
	BufferedImage connectionScreen;
	BufferedImage settingsScreen;
	boolean blnGameStart = false;
	boolean blnSettings = false;
	boolean blnHelp = false;
	boolean blnDarkMode = false;
	
	//METHODS
	public void paintComponent(Graphics g){
		// this is the flag
		try{
			gameBoard = ImageIO.read(new File("Pics/board.png"));
			gameBoardDark = ImageIO.read(new File("gameBoardDark.png"));
			// screens 
			mainMenu = ImageIO.read(new File("Pics/menu.png"));
			helpScreen1 = ImageIO.read(new File("Pics/helpScreen1.png"));
			helpScreen2 = ImageIO.read(new File("Pics/helpScreen2.png"));
			helpScreen3 = ImageIO.read(new File("Pics/helpScreen3.png"));
			connectionScreen = ImageIO.read(new File("Pics/connectionScreen.png"));
			settingsScreen = ImageIO.read(new File("Pics/settingScreen.png"));
		}catch(IOException e){
			
		}
		
		//need to put this first before the other screens
		g.drawImage(mainMenu, 0, 0, null);
		
		if(blnSettings == true){
			g.drawImage(settingsScreen, 0, 0, null);
		}else if(blnHelp == true){
			g.drawImage(helpScreen1, 0, 0, null);
		}else if(blnGameStart == true){
			// background
			if(blnDarkMode == true){
				g.setColor(Color.BLACK);
			}else{
				g.setColor(new Color(255, 234, 167));
			}
			g.fillRect(0, 0, 1280, 720);
			
			// game board
			if(blnDarkMode == true){
				g.drawImage(gameBoardDark, 10, 100, null);
				g.setColor(Color.WHITE);
				g.drawString("Dark Mode", 640, 28);
			}else{
				g.drawImage(gameBoard, 10, 100, null);
				g.setColor(Color.BLACK);
				g.drawString("Dark Mode", 640, 28);
			}
			//g.setColor(Color.WHITE);
			//g.fillRect(10, 60, 675, 600);
			
			// chat area
			g.setColor(new Color(116, 185, 255));
			g.fillRect(820, 10, 450, 345);
			g.setColor(Color.BLACK);
			g.drawString("Chat", 1040, 25);
			
			// rankings
			g.setColor(new Color(250, 177, 160));
			g.fillRect(820, 365, 450, 345);
			g.setColor(Color.BLACK);
			g.drawString("Rankings", 1025, 380);
		}
	}
	
	
	//CONSTRUCTOR
	public animation(){
		super();
	}
}









