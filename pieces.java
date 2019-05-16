public class pieces{
	// properties
	boolean isVisible;
	int intRank;
	int intX;
	int intY;
	boolean isClient;
	boolean inBattle;
	
	// methods
	public void move(){
		
	}
	public void battle(int intRank){
		
	}
	
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
