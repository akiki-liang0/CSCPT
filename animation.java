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
	public boolean blnGameStart =  true;
	public boolean blnDarkMode = false;
	public boolean blnGameInProgress = false;
	public boolean blnLockedIn = false;
	
	//Pieces Images
	public BufferedImage fiveStarB, fourStarB, threeStarB, twoStarB, oneStarB, colonelB, ltColonelB, majorB, captainB, firstLieutB, secondLieutB, sergeantB, privateB, spyB, flagB;
	public BufferedImage fiveStarW, fourStarW, threeStarW, twoStarW, oneStarW, colonelW, ltColonelW, majorW, captainW, firstLieutW, secondLieutW, sergeantW, privateW, spyW, flagW;
		
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
			fiveStarW = ImageIO.read(new File("Pics/White/FiveStarGeneralW.png"));
			fourStarB = ImageIO.read(new File("Pics/Black/FourStarGeneralB.png"));
			fourStarW = ImageIO.read(new File("Pics/White/FourStarGeneralW.png"));
			threeStarB = ImageIO.read(new File("Pics/Black/ThreeStarGeneralB.png"));
			threeStarB = ImageIO.read(new File("Pics/White/ThreeStarGeneralW.png"));
			twoStarB = ImageIO.read(new File("Pics/Black/TwoStarGeneralB.png"));
			twoStarW = ImageIO.read(new File("Pics/White/TwoStarGeneralW.png"));
			oneStarB = ImageIO.read(new File("Pics/Black/OneStarGeneralB.png"));
			oneStarW = ImageIO.read(new File("Pics/White/OneStarGeneralW.png"));
			colonelB = ImageIO.read(new File("Pics/Black/ColonelB.png"));
			colonelW = ImageIO.read(new File("Pics/White/ColonelW.png"));
			ltColonelB = ImageIO.read(new File("Pics/Black/LtColonelB.png"));
			ltColonelW = ImageIO.read(new File("Pics/White/LtColonelW.png"));
			majorB = ImageIO.read(new File("Pics/Black/MajorB.png"));
			majorW = ImageIO.read(new File("Pics/White/MajorW.png"));
			captainB = ImageIO.read(new File("Pics/Black/CaptainB.png"));
			captainW = ImageIO.read(new File("Pics/White/CaptainW.png"));
			firstLieutB	= ImageIO.read(new File("Pics/Black/FirstLtB.png"));
			firstLieutW	= ImageIO.read(new File("Pics/White/FirstLtW.png"));
			secondLieutB = ImageIO.read(new File("Pics/Black/SecondLtB.png"));
			secondLieutB = ImageIO.read(new File("Pics/White/SecondLtW.png"));
			sergeantB = ImageIO.read(new File("Pics/Black/SergeantB.png"));
			sergeantW = ImageIO.read(new File("Pics/White/SergeantW.png"));
			privateB = ImageIO.read(new File("Pics/Black/PrivateB.png"));
			privateW = ImageIO.read(new File("Pics/White/PrivateW.png"));
			spyB = ImageIO.read(new File("Pics/Black/SpyB.png"));
			spyW = ImageIO.read(new File("Pics/White/SpyW.png"));
			flagB = ImageIO.read(new File("Pics/Black/FlagB.png"));
			flagW = ImageIO.read(new File("Pics/White/F;agW.png")); 

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
			drawPieces(main.strBoard, g);// drawing pieces
		}else if(blnwin == true){
			//load font
			/*
			try {
				g.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Stencil Std Bold.ttf")));
		   } catch (IOException|FontFormatException e) {
				//Handle exception
		   }
		   */
		}else if(blnloss == true){

		}
		
	}
	public static void drawPieces(String[][] Board, Graphics g){
		// drawing to board
		String[] pieceSplit = new String[3];//splits "///" format in each cell of array
		String strPieceInfo = "";// "///" string
		String strImageName = "";// name for image
		int intX = 70, intY = 70;
		for(int row = 0; row < 8; row++){
			for(int col = 0; col < 9; col++){
				try{
					strPieceInfo = Board[row][col];
					pieceSplit = strPieceInfo.split("/");// split into an array by "/"
					if(pieceSplit[2].equals("W")){// if piece is white
						if (pieceSplit[0].equals("0")){// if id = flag
							strImageName = "Pics/White/FlagW.png";
						}else if (pieceSplit[0].equals("1")){// if id = spy
							strImageName = "Pics/White/SpyW.png";
						}else if (pieceSplit[0].equals("2")){// if id = private
							strImageName = "Pics/White/PrivateW.png";
						}else if (pieceSplit[0].equals("3")){// if id = sergeant
							strImageName = "Pics/White/SergeantW.png";
						}else if (pieceSplit[0].equals("4")){// if id = 2nd lieut
							strImageName = "Pics/White/SecondLtW.png";
						}else if (pieceSplit[0].equals("5")){// if id = 1st lieut
							strImageName = "Pics/White/FirstLtW.png";
						}else if (pieceSplit[0].equals("6")){// if id = captain
							strImageName = "Pics/White/CaptainW.png";
						}else if (pieceSplit[0].equals("7")){// if id = major
							strImageName = "Pics/White/MajorW.png";
						}else if (pieceSplit[0].equals("8")){// if id = Lt Colonel
							strImageName = "Pics/White/LtColonelW.png";
						}else if (pieceSplit[0].equals("9")){// if id = Colonel
							strImageName = "Pics/White/ColonelW.png";
						}else if (pieceSplit[0].equals("10")){// if id = general 1
							strImageName = "Pics/White/OneStarGeneralW.png";
						}else if (pieceSplit[0].equals("11")){// if id = general 2
							strImageName = "Pics/White/TwoStarGeneralW.png";
						}else if (pieceSplit[0].equals("12")){// if id = general 3
							strImageName = "Pics/White/ThreeStarGeneralW.png";
						}else if (pieceSplit[0].equals("13")){// if id = general 4
							strImageName = "Pics/White/FourStarGeneralW.png";
						}else if (pieceSplit[0].equals("14")){// if id = general 5
							strImageName = "Pics/White/FiveStarGeneralW.png";
						}
					}else if(pieceSplit[2].equals("B")){// if piece is black
						if (pieceSplit[0].equals("0")){// if id = flag
							strImageName = "Pics/Black/FlagB.png";
						}else if (pieceSplit[0].equals("1")){// if id = spy
							strImageName = "Pics/Black/SpyB.png";
						}else if (pieceSplit[0].equals("2")){// if id = private
							strImageName = "Pics/Black/PrivateB.png";
						}else if (pieceSplit[0].equals("3")){// if id = sergeant
							strImageName = "Pics/Black/SergeantB.png";
						}else if (pieceSplit[0].equals("4")){// if id = 2nd lieut
							strImageName = "Pics/Black/SecondLtB.png";
						}else if (pieceSplit[0].equals("5")){// if id = 1st lieut
							strImageName = "Pics/Black/FirstLtB.png";
						}else if (pieceSplit[0].equals("6")){// if id = captain
							strImageName = "Pics/Black/CaptainB.png";
						}else if (pieceSplit[0].equals("7")){// if id = major
							strImageName = "Pics/Black/MajorB.png";
						}else if (pieceSplit[0].equals("8")){// if id = Lt Colonel
							strImageName = "Pics/Black/LtColonelB.png";
						}else if (pieceSplit[0].equals("9")){// if id = Colonel
							strImageName = "Pics/Black/ColonelB.png";
						}else if (pieceSplit[0].equals("10")){// if id = general 1
							strImageName = "Pics/Black/OneStarGeneralB.png";
						}else if (pieceSplit[0].equals("11")){// if id = general 2
							strImageName = "Pics/Black/TwoStarGeneralB.png";
						}else if (pieceSplit[0].equals("12")){// if id = general 3
							strImageName = "Pics/Black/ThreeStarGeneralB.png";
						}else if (pieceSplit[0].equals("13")){// if id = general 4
							strImageName = "Pics/Black/FourStarGeneralB.png";
						}else if (pieceSplit[0].equals("14")){// if id = general 5
							strImageName = "Pics/Black/FiveStarGeneralB.png";
						}
					}else if(pieceSplit[2].equals("N")){
							strImageName = "";
					}
				}catch(ArrayIndexOutOfBoundsException e){
					
				}
				try{
					//draw image;
					g.drawImage(ImageIO.read(new File(strImageName)), intX, intY, null);
				}
				catch(IOException e){
					
				}
				intX += 75;
			}
			intX = 70;
			intY += 75;
		}
	}
	//CONSTRUCTOR
	public animation(){
		super();
	}
}
