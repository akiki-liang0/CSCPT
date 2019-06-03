public class pieces{
	// properties
	/** Whether or not a piece is visible */
	boolean isVisible;
	/** Ranking, piece #, piece */
	String strpieceCode;
	/** The x-coordinate of a piece */
	int intX;
	/** The y-coordinate of a piece */
	int intY;
	/** Whether or not a piece belongs to the client */
	boolean isClient;
	/** Whether or not a piece is in battle */
	boolean inBattle;
	
	// methods
	/** Returns row + column of current piece for movement */
	public String[] getPosition(String strpieceCode){
		String[] pieceData;
		pieceData = strpieceCode.split("/");
		return pieceData;
	}
	/** When two pieces battle, the winner is decided based on their rank */
	public void battle(int intRank){
		
	}
	
	/** Constructs a piece */
	// constructor
	public pieces(boolean isVisible, String strpieceCode, int intX, int intY, boolean isClient, boolean inBattle){
		this.isVisible = isVisible;
		this.strpieceCode = strpieceCode;
		this.intX = intX;
		this.intY = intY;
		this.isClient = isClient;
		this.inBattle = inBattle;
	}
}
