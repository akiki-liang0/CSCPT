import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class main implements ActionListener, MouseListener, MouseMotionListener, KeyListener, FocusListener{
	//PROPERTIES
	JFrame theframe = new JFrame("can this work thanks");
	animation thepanel = new animation();
	Timer thetimer = new Timer(1000/60, this);
	// Game screen
	JTextArea chatArea = new JTextArea();
	JScrollPane thescroll = new JScrollPane(chatArea);
	JTextField chat = new JTextField();
	JButton send = new JButton("Send");
	JButton darkON = new JButton("ON");
	JButton darkOFF = new JButton("OFF");
	JButton lockIn = new JButton("LOCK IN");
	// Settings
	JTextField portNumber = new JTextField();
	JTextField serverIP = new JTextField();
	// Connection Screen
	JTextField username = new JTextField("Username");
	JTextField portIPConnect = new JTextField("Port #, IP Address");
	SuperSocketMaster ssm;
  
	int intPort = 3000;
	
	PrintWriter connections = null;
	
	int test = 0;
		
	//METHODS
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == thetimer){
			thepanel.repaint();
		// chat background turns black, text turns white
		}else if(evt.getSource() == darkON){
			thepanel.blnDarkMode = true;
			darkON.setEnabled(false);
			darkOFF.setEnabled(true);
			chatArea.setBackground(Color.BLACK);
			chatArea.setForeground(Color.WHITE);
			thescroll.setBackground(Color.BLACK);
			thescroll.setForeground(Color.WHITE);
			chat.setBackground(Color.BLACK);
			chat.setForeground(Color.WHITE);
		// chat background turns white, text turns black
		}else if(evt.getSource() == darkOFF){
			thepanel.blnDarkMode = false;
			darkON.setEnabled(true);
			darkOFF.setEnabled(false);
			chatArea.setBackground(Color.WHITE);
			chatArea.setForeground(Color.BLACK);
			thescroll.setBackground(Color.WHITE);
			thescroll.setForeground(Color.BLACK);
			chat.setBackground(Color.WHITE);
			chat.setForeground(Color.BLACK);
		}else if(evt.getSource() == lockIn){
			lockIn.setVisible(false);
			// adding the components of the chat onto the panel
			thepanel.add(thescroll);
			thepanel.add(send);
			thepanel.add(chat);
			thepanel.add(darkON);
			thepanel.add(darkOFF);
		}else if(evt.getSource() == send){
			ssm.sendText(chat.getText());
			chatArea.append("me: "+chat.getText()+"\n");
			chat.setText("");
		}else if(evt.getSource() == ssm){
			chatArea.append("opponent: "+ssm.readText() + "\n");
		}
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
		// user on main menu page
		if(thepanel.blnMainMenu == true){
			// going to settings page
			if(evt.getX() >= 180 && evt.getX() <= 440 && evt.getY() >= 590 && evt.getY() <= 670){
				thepanel.blnSettings = true;
				thepanel.blnMainMenu = false;
				// adding the text fields to the panel
				thepanel.add(portNumber);
				thepanel.add(serverIP);
				portNumber.setVisible(true);
				serverIP.setVisible(true);
			// going to the help screens
			}else if(evt.getX() >= 860 && evt.getX() <= 1120 && evt.getY() >= 590 && evt.getY() <= 670 && thepanel.blnSettings == false){
				thepanel.blnHelp1 = true;
				thepanel.blnMainMenu = false;
			// going to play
			}else if(evt.getX() >= 500 && evt.getX() <= 800 && evt.getY() >= 520 && evt.getY() <= 670){
				thepanel.blnMainMenu = false;
				// going to connection screen
				if(thepanel.blnGameInProgress == false){
					thepanel.blnConnect = true;
					thepanel.add(username);
					thepanel.add(portIPConnect);
					username.setForeground(Color.GRAY);
					portIPConnect.setForeground(Color.GRAY);
				// resuming game after already having connected
				}else{
					thepanel.blnGameStart = true;
					thescroll.setVisible(true);
					send.setVisible(true);
					chat.setVisible(true);
					darkON.setVisible(true);
					darkOFF.setVisible(true);
				}
				
			}
		// user on settings page
		}else if(thepanel.blnSettings == true){
			// going back to the main menu
			if(evt.getX() >= 993 && evt.getX() <= 1201 && evt.getY() >= 26 && evt.getY() <= 81){
				thepanel.blnMainMenu = true;
				// copying text field contents to a text file
				try{
					connections = new PrintWriter(new FileWriter("connections.txt"));
					connections.println(portNumber.getText());
					connections.println(serverIP.getText());
					connections.close();
				}catch(IOException e){
					
				}
				// getting rid of the text fields
				portNumber.setVisible(false);
				serverIP.setVisible(false);
			}
		// user on the first help screen 
		}else if(thepanel.blnHelp1 == true){
			thepanel.blnSettings = false;
			// going to next help screen
			if(evt.getX() >= 1178 && evt.getX() <= 1232 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp2 = true;
				thepanel.blnHelp1 = false;
			}
		// user on second help screen
		}else if(thepanel.blnHelp2 == true){
			// going to previous help screen
	     	if(evt.getX() >= 1178 && evt.getX() <= 1232 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp3 = true;
				thepanel.blnHelp2 = false;
			// going to next help screen
			}else if(evt.getX() >= 47 && evt.getX() <= 101 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp1 = true;
				thepanel.blnHelp2 = false;
			}
		// user on third help screen
		}else if(thepanel.blnHelp3 == true){
			// going to previous help screen
			if(evt.getX() >= 1178 && evt.getX() <= 1232 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp4 = true;
				thepanel.blnHelp3 = false;
			// going to next help screen
			}else if(evt.getX() >= 47 && evt.getX() <= 101 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp2 = true;
				thepanel.blnHelp3 = false;
			}
		// user on fourth help screen
		}else if(thepanel.blnHelp4 == true){
			// going to previous help screen
			if(evt.getX() >= 1012 && evt.getX() <= 1217 && evt.getY() >= 44 && evt.getY() <= 108){
				thepanel.blnMainMenu = true;
				thepanel.blnHelp4 = false;
			// going to main menu
			}else if(evt.getX() >= 47 && evt.getX() <= 101 && evt.getY() >= 608 && evt.getY() <= 682){
				thepanel.blnHelp3 = true;
				thepanel.blnHelp4 = false;
			}
		}else if(thepanel.blnConnect == true){
			// if user clicks play and they have filled in the connection requirements
			if(evt.getX() >= 580 && evt.getX() <= 770 && evt.getY() >= 420 && evt.getY() <= 480 && !username.getText().equals("Username") && !portIPConnect.getText().equals("Port #, IP Address")){
				thepanel.blnGameStart = true;
				thepanel.blnConnect = false;
				username.setVisible(false);
				portIPConnect.setVisible(false);
				thepanel.add(lockIn);
				/*
				// adding the components of the chat onto the panel
				thepanel.add(thescroll);
				thepanel.add(send);
				thepanel.add(chat);
				thepanel.add(darkON);
				thepanel.add(darkOFF);
				*/
			}
		// user on the game screen
		}else if(thepanel.blnGameStart == true){ 
			// going back to the main menu
			if(evt.getX() >= 0 && evt.getX() <= 200 && evt.getY() >= 0 && evt.getY() <= 50){
				thepanel.blnMainMenu = true;
				thepanel.blnGameStart = false;
				thepanel.blnGameInProgress = true;
				// removing components of the chat from game screen
				thescroll.setVisible(false);
				send.setVisible(false);
				chat.setVisible(false);
				darkON.setVisible(false);
				darkOFF.setVisible(false);
			}
		}
	}
	public void keyReleased(KeyEvent evt){
	}
	public void keyTyped(KeyEvent evt){
	}
	public void keyPressed(KeyEvent evt){
	}
	// methods for placeholder text in the jtextfields
	public void focusGained(FocusEvent evt){
		if(username.getText().equals("Username") && username.isFocusOwner() == true){
			username.setText("");
			username.setForeground(Color.BLACK);
		}else if(portIPConnect.getText().equals("Port #, IP Address") && portIPConnect.isFocusOwner() == true){
			portIPConnect.setText("");
			portIPConnect.setForeground(Color.BLACK);
		}
	}
	public void focusLost(FocusEvent evt){
		if(username.getText().equals("")){
			username.setForeground(Color.GRAY);
			username.setText("Username");
		}
		if(portIPConnect.getText().equals("")){
			portIPConnect.setForeground(Color.GRAY);
			portIPConnect.setText("Port #, IP Address");
		}
	}
	//returns array representative of requested view of board

	public String[][] Board(boolean opponent){
		String[] csvSplit = new String[72];
		String[][] arrBoard = new String[8][7];
		String[][] oppBoard = new String[8][7];

		//read csv to array
		try {	
		BufferedReader file = new BufferedReader(new FileReader("csv.txt"));
			for (int i = 0; i < 8; i++) {
				String line = file.readLine();

				//split by commas, piece-relavant data is separated by "/"
				csvSplit = line.split(",");
				//for each string in array split
				for (String string : csvSplit) {
					for(int row = 0; row < 7; row++){
						for(int col = 0; col < 8; col++){
						arrBoard[row][col] = string;

						//loop through array replace [0][0] with [8][8] and so forth
						for(int newrow = 7; newrow >= 0; newrow--){
							for(int newcol = 8; newcol >= 0; newcol--){
								oppBoard[newrow][newcol] = arrBoard[row][col];
							}
						}
					}
					}
					
				}
			}
		} catch (IOException e) {
			System.out.println("Error loading file");
		}

		if(opponent == true){
			return oppBoard;
		}else{
			return arrBoard;
		}
	}
	
    //CONSTRUCTOR
	public main(){
		// panel
		thepanel.setLayout(null);
		thepanel.setPreferredSize(new Dimension(1280, 720));
		thepanel.addMouseListener(this);
		thepanel.addMouseMotionListener(this);
		
		// button to lock pieces in
		lockIn.setBounds(830, 20, 430, 325);
		lockIn.addActionListener(this);
		
		// the chat
		thescroll.setBounds(830, 30, 430, 255);
		chat.setBounds(830, 295, 320, 50);
		send.setBounds(1160, 295, 100, 50);
		send.addActionListener(this);
		darkON.setBounds(705, 10, 55, 25);
		darkON.addActionListener(this);
		darkOFF.setBounds(755, 10, 55, 25);
		darkOFF.addActionListener(this);
		darkOFF.setEnabled(false);
		
		// settings screen
		portNumber.setBounds(247, 135, 250, 25);
		portNumber.addActionListener(this);
		serverIP.setBounds(192, 198, 250, 25);
		serverIP.addActionListener(this);
		
		// connection screen
		username.setBounds(450, 292, 450, 25);
		username.addActionListener(this);
		username.addFocusListener(this);
		portIPConnect.setBounds(450, 351, 450, 25);
		portIPConnect.addActionListener(this);
		portIPConnect.addFocusListener(this);
		
		// frame
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


