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
	BufferedImage helpScreen4;
	BufferedImage connectionScreen;
	BufferedImage settingsScreen;
	boolean blnMainMenu = true;
	boolean blnGameStart = false;
	boolean blnSettings = false;
	boolean blnHelp1 = false;
	boolean blnHelp2 = false;
	boolean blnHelp3 = false;
	boolean blnHelp4 = false;
	boolean blnDarkMode = false;
	
	//METHODS
	public void paintComponent(Graphics g){
		try{
			gameBoard = ImageIO.read(new File("Pics/board.png"));
			//gameBoardDark = ImageIO.read(new File("gameBoardDark.png"));
			// screens 
			mainMenu = ImageIO.read(new File("Pics/menu.png"));
			helpScreen1 = ImageIO.read(new File("Pics/helpScreen1.png"));
			helpScreen2 = ImageIO.read(new File("Pics/helpScreen2.png"));
			helpScreen3 = ImageIO.read(new File("Pics/helpScreen3.png"));
			helpScreen4 = ImageIO.read(new File("Pics/helpScreen4.png"));
			connectionScreen = ImageIO.read(new File("Pics/connectionScreen.png"));
			settingsScreen = ImageIO.read(new File("Pics/settingScreen.png"));
		}catch(IOException e){
			
		}
		
		if(blnMainMenu == true){
			g.drawImage(mainMenu, 0, 0, null);
		}else if(blnSettings == true){
			g.drawImage(settingsScreen, 0, 0, null);
		}else if(blnHelp1 == true){
			g.drawImage(helpScreen1, 0, 0, null);
		}else if(blnHelp2 == true){
			g.drawImage(helpScreen2, 0, 0, null);
		}else if(blnHelp3 == true){
			g.drawImage(helpScreen3, 0, 0, null);
		}else if(blnHelp4 == true){
			g.drawImage(helpScreen4, 0, 0, null);
		}else if(blnGameStart == true){
			g.drawImage(gameBoard, 0, 0, null);
			g.setColor(Color.BLACK);
			g.drawString("Dark Mode", 640, 28);
			// chat area
			g.setColor(Color.BLACK);
			g.drawString("Chat", 1040, 25);
			// rankings
			g.setColor(Color.BLACK);
			g.drawString("Rankings", 1025, 385);
			
		}
	}
	
	
	//CONSTRUCTOR
	public animation(){
		super();
	}
}









