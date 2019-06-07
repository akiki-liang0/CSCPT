import java.io.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.*;
import java.awt.font.*;
import javax.swing.*;

public class animation extends JPanel{
	//PROPERTIES
	// Main Menu
	public BufferedImage mainMenu;
	public BufferedImage menuPlayPressed;
	public BufferedImage menuHelpPressed;
	public BufferedImage menuSettingsPressed;
	public boolean blnMainMenu = false;
	
	// Game Screen
	public BufferedImage gameBoard;
	public BufferedImage gameBoardDark;
	public boolean blnGameStart = true;
	public boolean blnDarkMode = false;
	public boolean blnGameInProgress = false;

		//Pieces Images
		public BufferedImage fiveStarB;
	// Settings
	public BufferedImage settingsScreen;
	public boolean blnSettings = false;
	// Help Screen
	public BufferedImage helpScreen1;
	public BufferedImage helpScreen2;
	public BufferedImage helpScreen3;
	public BufferedImage helpScreen4;
	
	public boolean blnHelp1 = false;
	public boolean blnHelp2 = false;
	public boolean blnHelp3 = false;
	public boolean blnHelp4 = false;
	// Win Screen
	boolean blnwin = false;
	// Lose Screen
	boolean blnloss = false;
	// Connection Screen
	public BufferedImage connectionScreen;
	public boolean blnConnect = false;
	
	//METHODS
	public void paintComponent(Graphics g){
		// loading all the images
		try{
			gameBoard = ImageIO.read(new File("Pics/board.png"));
			gameBoardDark = ImageIO.read(new File("Pics/boardDark.png"));
			// screens 
			mainMenu = ImageIO.read(new File("Pics/menu.png"));
			helpScreen1 = ImageIO.read(new File("Pics/helpScreen1.png"));
			helpScreen2 = ImageIO.read(new File("Pics/helpScreen2.png"));
			helpScreen3 = ImageIO.read(new File("Pics/helpScreen3.png"));
			helpScreen4 = ImageIO.read(new File("Pics/helpScreen4.png"));
			connectionScreen = ImageIO.read(new File("Pics/connectionScreen.png"));
			settingsScreen = ImageIO.read(new File("Pics/settingScreen.png"));
			menuPlayPressed = ImageIO.read(new File("Pics/ButtonPressed/MenuPlayPressed.png"));
			menuHelpPressed = ImageIO.read(new File("Pics/ButtonPressed/MenuHelpPressed.png"));
			menuSettingsPressed = ImageIO.read(new File("Pics/ButtonPressed/MenuSettingsPressed.png"));
			// pieces
			fiveStarB = ImageIO.read(new File("Pics/Black/FiveStarGeneralB.png"));
		}catch(IOException e){
			System.out.println("Interrupted Exception");
		}
		
		// drawing main menu screen
		if(blnMainMenu == true){
			g.drawImage(mainMenu, 0, 0, null);
		// drawing settings page
		}else if(blnSettings == true){
			//try{
				g.drawImage(menuSettingsPressed, 0, 0, null);
				//Thread.sleep(1000);
				g.drawImage(settingsScreen, 0, 0, null);
			//}catch(InterruptedException e){
			//}
		// drawing help screens 1-4
		}else if(blnHelp1 == true){
			g.drawImage(helpScreen1, 0, 0, null);
		}else if(blnHelp2 == true){
			g.drawImage(helpScreen2, 0, 0, null);
		}else if(blnHelp3 == true){
			g.drawImage(helpScreen3, 0, 0, null);
		}else if(blnHelp4 == true){
			g.drawImage(helpScreen4, 0, 0, null);
		// drawing things when the game starts
		}else if(blnConnect == true){
			g.drawImage(connectionScreen, 0, 0, null);
		}else if(blnGameStart == true){
			if(blnDarkMode == true){
				g.drawImage(gameBoardDark, 0, 0, null);
			}else{
				g.drawImage(gameBoard, 0, 0, null);
			}
			g.setColor(Color.BLACK);
			g.drawString("Dark Mode", 640, 28);
			// chat area
			g.setColor(Color.BLACK);
			g.drawString("Chat", 1040, 25);
			// rankings
			g.setColor(Color.BLACK);
			g.drawString("Rankings", 1025, 385);
			
			g.drawImage(fiveStarB, 214, 214, null);
		}else if(blnwin == true){
			//load font
			/*try {
				g.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Stencil Std Bold.ttf")));
		   } catch (IOException|FontFormatException e) {
				//Handle exception
		   }*/
		}else if(blnloss == true){

		}
		
	}
	
	//CONSTRUCTOR
	public animation(){
		super();
	}
}
