public class pieces{
	// properties
	/** Whether or not a piece is visible */
	boolean isVisible;
	/** A given piece's rank */
	int intRank;
	/** The x-coordinate of a piece */
	int intX;
	/** The y-coordinate of a piece */
	int intY;
	/** Whether or not a piece belongs to the client */
	boolean isClient;
	/** Whether or not a piece is in battle */
	boolean inBattle;
	
	// methods
	/** Moves the piece to the desired location */
	public void move(){
		
	}
	/** When two pieces battle, the winner is decided based on their rank */
	public void battle(int intRank){
		
	}
	
	/** Constructs a piece */
	// constructor
	public pieces(boolean isVisible, int intRank, int intX, int intY, boolean isClient, boolean inBattle){
		this.isVisible = isVisible;
		this.intRank = intRank;
		this.intX = intX;
		this.intY = intY;
		this.isClient = isClient;
		this.inBattle = inBattle;
	}
}
